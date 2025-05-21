package ejercicio6;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedInputOutputStreamExample {
	
//	

	public static void main(String[] args) throws IOException {
		PipedOutputStream pos = null;
		try {
			pos = new PipedOutputStream();
			pos.write("a".getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pos.close();
		}
		
		PipedInputStream pis = null;
		try {
			pis = new PipedInputStream();
			int data;
            while ((data = pis.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            pis.close();
        }

	}

}
