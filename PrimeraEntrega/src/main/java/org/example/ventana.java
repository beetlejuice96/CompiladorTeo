package org.example;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;


import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTable;

public class ventana extends JFrame {
	private List<Token> tokens;
	private JFrame frame;
	private JTable table;
	private DefaultTableModel modelo = new DefaultTableModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana window = new ventana();
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
	public ventana() {
		initialize();
	}
	//este mostrar toma el texto del archivo que elegimos
	public String mostrar(String path) throws IOException{
		System.out.println("jelou");
		FileReader f = new FileReader(path);
		Lexico lexer = new Lexico(f);
		System.out.println("jelou2");
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
	
	public void cargarTabla (List<Token> tokens){
		String[] tokensPermitidos ={"CONST_INT","FLOAT","CONST_STRING","VAR"};
		modelo.setRowCount(0);
		for (int i=0; i< tokens.size(); i++) {
			Token tk = tokens.get(i);
			if (Arrays.asList(tokensPermitidos).contains(tk.getToken())){
				if (tk.getToken()=="CONST_STRING"){
					int longitud = tk.getLongitud()-2;
					Object [] object = new Object[]{tk.getLexema(),tk.getToken(),"",tk.getValor(),longitud};
					modelo.addRow(object);
				}else {
					Object[] object = new Object[]{tk.getLexema(), tk.getToken(), "", tk.getValor(),};
					modelo.addRow(object);
				}
			}

		}


	}

	
	
	//este mostrar toma el texto del primer textpane
	public String mostrarString(String texto) throws IOException{
		StringReader reader = new StringReader(texto);
		Lexico lexer = new Lexico(reader);
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


	/** exportar a archivo .xls*/
	public void exportExcel(JTable table) throws IOException {
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
		chooser.setFileFilter(filter);
		chooser.setDialogTitle("Guardar archivo");
		chooser.setAcceptAllFileFilterUsed(false);
		if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
			String ruta = chooser.getSelectedFile().toString().concat(".xls");
			try {
				File archivoXLS = new File(ruta);
				if (archivoXLS.exists()) {
					archivoXLS.delete();
				}
				archivoXLS.createNewFile();
				Workbook libro = new HSSFWorkbook();
				FileOutputStream archivo = new FileOutputStream(archivoXLS);
				Sheet hoja = libro.createSheet("Mi hoja de trabajo 1");
				hoja.setDisplayGridlines(false);
				for (int f = 0; f < table.getRowCount(); f++) {
					Row fila = hoja.createRow(f);
					for (int c = 0; c < table.getColumnCount(); c++) {
						Cell celda = fila.createCell(c);
						if (f == 0) {
							celda.setCellValue(table.getColumnName(c));
						}
					}
				}
				int filaInicio = 1;
				for (int f = 0; f < table.getRowCount(); f++) {
					Row fila = hoja.createRow(filaInicio);
					filaInicio++;
					for (int c = 0; c < table.getColumnCount(); c++) {
						Cell celda = fila.createCell(c);
						if (table.getValueAt(f, c) instanceof Double) {
							celda.setCellValue(Double.parseDouble(table.getValueAt(f, c).toString()));
						} else if (table.getValueAt(f, c) instanceof Float) {
							celda.setCellValue(Float.parseFloat((String) table.getValueAt(f, c)));
						} else {
							celda.setCellValue(String.valueOf(table.getValueAt(f, c)));
						}
					}
				}
				libro.write(archivo);
				archivo.close();
				Desktop.getDesktop().open(archivoXLS);
			} catch (IOException | NumberFormatException e) {
				throw e;
			}
		}



	}



	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1275, 591);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEscriba = new JLabel("Entrada:");
		lblEscriba.setBounds(32, 46, 70, 15);
		frame.getContentPane().add(lblEscriba);
		
		final JTextPane txtpnHolaa = new JTextPane();
		txtpnHolaa.setText("holaa");
		txtpnHolaa.setBounds(32, 72, 316, 307);
		frame.getContentPane().add(txtpnHolaa);
		
		final JTextPane txtpnHola = new JTextPane();
		txtpnHola.setText("hola2");
		txtpnHola.setBounds(32, 54, 423, 168);
		frame.getContentPane().add(txtpnHola);
		
		JLabel lblSalida = new JLabel("Salida:");
		lblSalida.setBounds(469, 46, 70, 15);
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
		btnIngresarArchivo.setBounds(32, 478, 232, 25);
		frame.getContentPane().add(btnIngresarArchivo);
		
		JButton btnEscanearTexto = new JButton("Escanear entrada");
		btnEscanearTexto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String texto_area_holaa = txtpnHolaa.getText();
					System.out.println(texto_area_holaa);
					txtpnHola.setText(mostrarString(texto_area_holaa));
					cargarTabla(tokens);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		});
		
		btnEscanearTexto.setBounds(32, 403, 140, 25);
		frame.getContentPane().add(btnEscanearTexto);
		
		JButton btnExportar = new JButton("Exportar salida");
		btnExportar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					exportExcel(table);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		btnExportar.setBounds(469, 403, 140, 25);
		frame.getContentPane().add(btnExportar);
		
		JScrollPane scrollPane = new JScrollPane(txtpnHola);
		scrollPane.setBounds(469, 72, 318, 307);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(modelo);
		modelo.setColumnIdentifiers(new Object[] {
				"Nombre", "Token", "Tipo", "valor","Long"
		});
		table.setBounds(840, 72, 379, 307);
		frame.getContentPane().add(table);

		
		
		JLabel lblNewLabel = new JLabel("Tabla de  Simbolos:");
		lblNewLabel.setBounds(848, 47, 196, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane_1 = new JScrollPane(table);// le estoy pasando la tabla
		scrollPane_1.setBounds(848, 75, 401, 307);
		frame.getContentPane().add(scrollPane_1);

	}
}