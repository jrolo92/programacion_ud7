package ejercicio6;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamExample {

//	Permite escribir datos primitivos (de cualquier tipo) en un archivo
	
	public static void main(String[] args) throws IOException {
		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(new FileOutputStream("datos.bin"));
			dos.writeDouble(9.50);// Aqui podemos escoger el tipo de dato a escribir
			System.out.println("Datos primitivos escritos");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			dos.close();
		}

	}

}
