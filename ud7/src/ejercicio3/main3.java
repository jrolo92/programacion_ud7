package ejercicio3;

import java.io.IOException;

public class main3 {

	public static void main(String[] args) {
		byte b[] = new byte[5];
		try {
			System.in.read(b);
		}catch (IOException ioe) {
			System.out.println(ioe);
		}
		String s = new String (b);
		System.out.println(s);
	}

/*
* 	Lo que hace este codigo es leer bytes e incluirlos en un array 
* 	que luego pasa a String para imprimirlo.
*/
}
