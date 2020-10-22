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
import java.awt.event.ActionEvent;
import java.awt.Choice;

public class VentanaPrincipal extends JFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal window = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		initialize();
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
					archivos = new FileReader(abrir);
					BufferedReader leer = new BufferedReader (archivos);
					  while((aux=leer.readLine())!=null)
				      {
				         texto+= aux+ "\n";
				      }
					  leer.close();
					  txtpnHolaa.setText(texto);
					}
				}catch(IOException ex) {
					
				}
				
			}
		});
		btnIngresarArchivo.setBounds(12, 0, 117, 25);
		frame.getContentPane().add(btnIngresarArchivo);
	}
}