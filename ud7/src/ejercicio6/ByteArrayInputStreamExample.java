package ejercicio6;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamExample {

	public static void main(String[] args) throws IOException {
		ByteArrayInputStream bais = null;
		byte[] data = "Texto".getBytes();
		try {
			bais = new ByteArrayInputStream(data);
			int content;
			while ((content = bais.read()) != -1) {
				System.out.print((char) content);
			}
		} finally {
			bais.close();
		}

	}

}
