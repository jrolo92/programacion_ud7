package ejercicio6;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

//	Combina varios flujos de entrada en uno solo.

public class SequenceInputStreamExample {

	public static void main(String[] args) throws IOException {
		FileInputStream fis1 = new FileInputStream("archivo1.txt");
		FileInputStream fis2 = new FileInputStream("archivo2.txt");
		SequenceInputStream sis = null;
		
		try {
			sis = new SequenceInputStream(fis1, fis2);
			int data;
			while ((data = sis.read()) != -1) {
				System.out.println((char) data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sis.close();
		}
	}

}
