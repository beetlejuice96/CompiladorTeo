
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List; 

public class MainLexico {

	public static void main(String[] args) throws IOException {
	try {	// TODO Auto-generated method stub

		FileReader f = new FileReader("C:/Users/Matias/Desktop/PRUEBA.txt");
		Lexico Lexer = new Lexico(f);
		List<Token> tokens;
		
		
		Lexer.next_token();
		
	
		tokens = Lexer.getListToken();
		
		//System.out.println(tokens.size());
		
		for (int i=0; i< tokens.size(); i++) {
			System.out.println("Lexema --> " + tokens.get(i).getLexema() );
			System.out.println("Token --> " + tokens.get(i).getToken());
			System.out.println("Valor --> "+ tokens.get(i).getValor());
			System.out.println("Longitud  -->"+ tokens.get(i).getLongitud());
			System.out.println("---------------------------------");
			
			
		}
	
		
	}catch (FileNotFoundException ex) {
		System.out.println("No se encontro el archivo");
	 } 
	}

}
