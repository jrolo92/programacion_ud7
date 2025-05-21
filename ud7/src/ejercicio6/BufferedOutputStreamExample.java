package ejercicio6;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {

//	Es un FileOutputStream mejorado por el uso del búfer
	
	public static void main(String[] args) throws IOException {
		BufferedOutputStream bos = null;
		try {
			bos = new BufferedOutputStream(new FileOutputStream("archivo.txt"));
			bos.write((byte)'b');
			System.out.println("Datos escritos usando un búfer");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			bos.close();
		}

	}

}
