package ejercicio6;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamExample {

//	Escribe datos en un array de bytes
	
	public static void main(String[] args) {
		ByteArrayOutputStream baos= null;
		try {
			baos = new ByteArrayOutputStream();
			baos.write("ABCDE".getBytes());
			System.out.println("Datos almacenados en memoria: " + baos.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
