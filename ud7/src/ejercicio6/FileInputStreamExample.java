package ejercicio6;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
	
//	Se usa para leer bytes desde un archivo

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("archivo.txt");
			int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        	fis.close();
        }
		
	}

}
