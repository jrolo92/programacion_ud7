package ejercicio6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamExample {

//	Sirve para imprimir datos en un archivo de salida
	
	public static void main(String[] args) {
		PrintStream ps = null;
		try {
			ps = new PrintStream(new FileOutputStream("salida.txt"));
			ps.println("Impreso con PrintStream en el archivo salida.txt");
			System.out.println("Impreso correctamente!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			ps.close();
		}

	}

}
