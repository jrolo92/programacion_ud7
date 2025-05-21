package ejercicio6;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

//	Permite escribir datos primitivos (de cualquier tipo) en un archivo

public class DataInputStreamExample {

	public static void main(String[] args) throws IOException {
		DataInputStream dis = null;
		try {
			dis = new DataInputStream(new FileInputStream("datos.bin"));
		    System.out.println("Doble: " + dis.readDouble());
		} catch (IOException e) {
            e.printStackTrace();
        } finally {
        	dis.close();
        }

	}

}
