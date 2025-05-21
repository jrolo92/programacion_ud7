package ejercicio6;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

//	Se usa para escribir bytes en un archivo.
	
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null; // La inicializamos con valor nulo para que no de problemas
		try {
			fos = new FileOutputStream ("C:\\Users\\usuario\\ejemplo.bin");
			fos.write((byte)'a');
			System.out.println("Datos escritos en el archivo");
		} catch (FileNotFoundException e ) {
			System.out.println("");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			fos.close();// Hemos tenido que hacer propagacion de excepcion
		}

	}

}
