package org.example;

import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.awt.event.ActionEvent;

public class AnalizadorSintactico {

	private JFrame frame;
	private JTable table_1;
	private DefaultTableModel modelo = new DefaultTableModel();
	private List<Token> tokens_lexico;
	private List<Token> tokens_id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnalizadorSintactico window = new AnalizadorSintactico();
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
	public AnalizadorSintactico() {
		initialize();
	}

	public String mostrar(String path) throws FileNotFoundException {
		FileReader f = new FileReader(path);
		Lexico lexer = new Lexico(f);
		tokens_lexico = lexer.getListToken();
		@SuppressWarnings("deprecation")
		parser sintactico = new parser(lexer);
		
		try {
			sintactico.parse();
			List<Regla> listaRegla= new ArrayList<>();
			listaRegla = sintactico.getListaReglas();
			tokens_id = sintactico.getListaTokens();
			
			String resultado="";

			for (int i=0; i< listaRegla.size(); i++) {
				if (listaRegla.get(i).getValorRegla() != null) {
					resultado =resultado + "\nRegla [ "+listaRegla.get(i).getNroRegla() +" ] "+" -->   "+listaRegla.get(i).getRegla() +"\n"+"  Valor: " +listaRegla.get(i).getValorRegla().toString()+"\n";

				}
			}
			return resultado;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage(),"ERROR", JOptionPane.PLAIN_MESSAGE);

		}
		return "error de analisis";

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
	
	public void cargarTabla (){
		String[] tokensPermitidos ={"CONST_INT","CONST_FLOAT","CONST_STRING","VAR"};
		List<String> tokensCargados = new ArrayList<String>();
		modelo.setRowCount(0);
		for (int i=0; i< tokens_lexico.size(); i++) {
			Token tk = tokens_lexico.get(i);
			String tkActual = tk.getLexema();
			if ((Arrays.asList(tokensPermitidos).contains(tk.getToken())) && (tokensCargados.contains(tkActual)==false)){
				if (tk.getToken()=="CONST_STRING"){
					int longitud = tk.getLongitud()-2;
					Object [] object = new Object[]{tk.getLexema(),tk.getToken(),"",tk.getValor(),longitud};
					tokensCargados.add(tk.getLexema());
					modelo.addRow(object);
				}else if(tk.getToken()=="VAR") {
				
					for(int t=0; t<tokens_id.size();t++) {
						System.out.println("token id: "+tokens_id.get(t).getLexema() + "  token_lexico: "+tk.getLexema());
						if (tokens_id.get(t).getLexema().equals(tkActual)) {
							System.out.println("entro al if");
							Object[] object = new Object[]{tokens_id.get(t).getLexema(), tokens_id.get(t).getToken(),tokens_id.get(t).getTipo(), tokens_id.get(t).getValor(),};
							modelo.addRow(object);
						}
					}
					
					tokensCargados.add(tk.getLexema());
					
				}else {
					Object[] object = new Object[]{tk.getLexema(), tk.getToken(), "", tk.getValor(),};
					tokensCargados.add(tk.getLexema());
					modelo.addRow(object);
				}
			}

		}


	}
	
	
	/*public Token getTokenParse(Token tk_lexico) {
		
		Token resultado.
		
		for(int i=0; i<tokens_id.size();i++) {
			if (tokens_id.get(i).getLexema()==tk_lexico.getLexema()) {
				resultado = tokens_id.get(i);
			}
		}
		return resultado;
	}*/
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 988, 1044);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(470, 67, 317, 506);
		frame.getContentPane().add(textPane);
		
		final JTextPane textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		textPane_1.setBounds(455, 82, 7, 20);
		frame.getContentPane().add(textPane_1);
		
		
		JButton btnNewButton = new JButton("Cargar Archivo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
					  textPane.setText(texto);
					  textPane_1.setText(mostrar(abrir.getAbsolutePath()));
					  cargarTabla();
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(20, 46, 130, 23);
		frame.getContentPane().add(btnNewButton);
		
	

		
		//al scroll le paso el textPane
		JScrollPane scrollPane = new JScrollPane(textPane);
		scrollPane.setBounds(20, 82, 406, 491);
		frame.getContentPane().add(scrollPane);
		

		JScrollPane scrollPane_1 = new JScrollPane(textPane_1);
		scrollPane_1.setBounds(472, 82, 485, 491);
		frame.getContentPane().add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(modelo);
		modelo.setColumnIdentifiers(new Object[] {
				"Nombre", "Token", "Tipo", "valor","Long"
		});
		table_1.setBounds(20, 584, 30, 23);
		frame.getContentPane().add(table_1);
		
		JScrollPane scrollPane_2 = new JScrollPane(table_1);
		scrollPane_2.setBounds(20, 618, 942, 361);
		frame.getContentPane().add(scrollPane_2);
		
		JButton btnNewButton_1 = new JButton("Exportar Tabla");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					exportExcel(table_1);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(20, 584, 121, 23);
		frame.getContentPane().add(btnNewButton_1);
		
	}
}
