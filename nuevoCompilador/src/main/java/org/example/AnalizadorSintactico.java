package org.example;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class AnalizadorSintactico {

	private JFrame frame;

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

	public String mostrar(String path) throws Exception{
		FileReader f = new FileReader(path);
		Lexico lexer = new Lexico(f);
		@SuppressWarnings("deprecation")
		parser sintactico = new parser(lexer);
		sintactico.parse();
		List<Regla> listaRegla= new ArrayList<>();
		listaRegla = sintactico.getListaReglas();
		
		  String resultado="";
		
			for (int i=0; i< listaRegla.size(); i++) {
				if (listaRegla.get(i).getValorRegla() != null) { 
					resultado =resultado + "\nRegla [ "+listaRegla.get(i).getNroRegla() +" ] "+" -->   "+listaRegla.get(i).getRegla() +"\n"+"  Valor: " +listaRegla.get(i).getValorRegla().toString()+"\n";	
					 
				}
				}
			return resultado;
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1009, 623);
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
		scrollPane_1.setBounds(472, 82, 420, 491);
		frame.getContentPane().add(scrollPane_1);
		
	}
}
