package ejemploflex;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploFlex {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			FileReader f = new FileReader("/home/dilan/Documentos/prueba2.txt");
			Lexico Lexer = new Lexico(f);
			Lexer.next_token();
			
		}catch (FileNotFoundException ex) {
			System.out.println("lalalalalal");
		}

	}

}
