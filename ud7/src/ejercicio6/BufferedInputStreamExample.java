package ejercicio6;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

//	Es un FileInputStream mejorado por el uso del búfer

public class BufferedInputStreamExample {

	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = null;
		try {
			bis = new BufferedInputStream(new FileInputStream("archivo.txt"));
	            int data;
	            while ((data = bis.read()) != -1) {
	                System.out.print((char) data);
	            }
	    } catch (IOException e) {
	            e.printStackTrace();
	    } finally {
	        bis.close();	
	    }
	}
	
}
		
		

	


