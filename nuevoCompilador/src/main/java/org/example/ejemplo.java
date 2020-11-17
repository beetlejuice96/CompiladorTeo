package org.example;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
public class ejemplo {

	public static void main(String[] args) throws FileNotFoundException , Exception{
		FileReader f = new FileReader("C:/Users/Matias/Documents/Unlu Maty/Teoria de la Computacion I/TP Integrador/trabajo/PRUEBA.txt");
		Lexico Lexer = new Lexico(f);
		parser sintactico = new parser(Lexer);
		sintactico.parse();
		List<Regla> listaRegla= new ArrayList<>();
		
		listaRegla = sintactico.getListaReglas();
		
		for (int i=0; i< listaRegla.size(); i++) {
			if (listaRegla.get(i).getValorRegla() != null) { 
				System.out.println("Regla [ "+listaRegla.get(i).getNroRegla() +" ] "+" -->   "+listaRegla.get(i).getRegla() +"\n"+"  Valor: " +listaRegla.get(i).getValorRegla().toString()+"\n");	
				 
			}
			}
		}

}
