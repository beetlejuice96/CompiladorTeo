import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;


import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Choice;

public class ventanaNueva extends JFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaNueva window = new ventanaNueva();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ventanaNueva() {
		initialize();
	}
	//este mostrar toma el texto del archivo que elegimos
	public String mostrar(String path) throws IOException{
		System.out.println("jelou");
		FileReader f = new FileReader(path);
		Lexico lexer = new Lexico(f);
		System.out.println("jelou2");
		  List<Token> tokens;
		  lexer.next_token();
			tokens = lexer.getListToken();
			System.out.println(tokens.size());
			String texto="";
			for (int i=0; i< tokens.size(); i++) {
				texto = texto + "Lexema --> " + tokens.get(i).getLexema() + "\n";
				texto = texto + "Token --> " + tokens.get(i).getToken()+ "\n";
				texto = texto + "Valor --> "+ tokens.get(i).getValor()+ "\n";
				texto = texto + "Longitud  -->"+ tokens.get(i).getLongitud()+ "\n";
				texto = texto + "---------------------------------"+ "\n";	
			}
			return texto;
	}
	
	
	//este mostrar toma el texto del primer textpane
	public String mostrarString(String texto) throws IOException{
		StringReader reader = new StringReader(texto);
		Lexico lexer = new Lexico(reader);
		  List<Token> tokens;
		  lexer.next_token();
			tokens = lexer.getListToken();
			System.out.println(tokens.size());
			String resultado="";
			for (int i=0; i< tokens.size(); i++) {
				resultado = resultado + "Lexema --> " + tokens.get(i).getLexema() + "\n";
				resultado = resultado + "Token --> " + tokens.get(i).getToken()+ "\n";
				resultado = resultado + "Valor --> "+ tokens.get(i).getValor()+ "\n";
				resultado = resultado + "Longitud  -->"+ tokens.get(i).getLongitud()+ "\n";
				resultado = resultado + "---------------------------------"+ "\n";	
			}
			return resultado;
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 575, 467);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEscriba = new JLabel("Escriba:");
		lblEscriba.setBounds(12, 46, 70, 15);
		frame.getContentPane().add(lblEscriba);
		
		JTextPane txtpnHolaa = new JTextPane();
		txtpnHolaa.setText("holaa");
		txtpnHolaa.setBounds(22, 72, 253, 298);
		frame.getContentPane().add(txtpnHolaa);
		
		JTextPane txtpnHola = new JTextPane();
		txtpnHola.setText("hola2");
		txtpnHola.setBounds(317, 72, 246, 298);
		frame.getContentPane().add(txtpnHola);
		
		JLabel lblSalida = new JLabel("Salida:");
		lblSalida.setBounds(318, 46, 70, 15);
		frame.getContentPane().add(lblSalida);
		
		JButton btnIngresarArchivo = new JButton("ingresar archivo");
		btnIngresarArchivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String aux= "";
				String texto = "";
				try {
				JFileChooser file = new JFileChooser();
				file.showOpenDialog(null);
				File abrir = file.getSelectedFile();
				if (abrir != null) {
					FileReader archivos;
					archivos = new FileReader(abrir.getAbsolutePath());
					BufferedReader leer = new BufferedReader (archivos);
					  while((aux=leer.readLine())!=null)
				      {
				         texto+= aux+ "\n";
				      }
					  
					  leer.close();
					  txtpnHolaa.setText(texto);
					  txtpnHola.setText(mostrar(abrir.getAbsolutePath()));
					}
				}catch(IOException ex) {
					
				}
				
			}
		});
		btnIngresarArchivo.setBounds(12, 0, 185, 25);
		frame.getContentPane().add(btnIngresarArchivo);
		
		JButton btnEscanearTexto = new JButton("Escanear texto");
		btnEscanearTexto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String texto_area_holaa = txtpnHolaa.getText();
					System.out.println(texto_area_holaa);
					txtpnHola.setText(mostrarString(texto_area_holaa));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		});
		btnEscanearTexto.setBounds(85, 371, 140, 25);
		frame.getContentPane().add(btnEscanearTexto);
		

	}
}
