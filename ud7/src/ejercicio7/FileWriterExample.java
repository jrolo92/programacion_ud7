package ejercicio7;

import java.io.FileWriter;
import java.io.IOException;

// Se usa para escribir caracteres en un archivo

public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		FileWriter fw = null;
		try {
			fw = new FileWriter("archivo.txt");
			fw.write("Texto");
			System.out.println("Texto escrito en el archivo");
			
		} catch (IOException e) {
            e.printStackTrace();
        } finally {
        	fw.close();
        }

	}

}
