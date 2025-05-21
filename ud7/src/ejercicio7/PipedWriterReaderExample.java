package ejercicio7;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

// Se usa para comunicación entre hilos

public class PipedWriterReaderExample {
    public static void main(String[] args) throws IOException {
        PipedWriter pw = new PipedWriter();
        PipedReader pr = new PipedReader(pw);

            try {
                pw.write("Mensaje entre hilos");
                pw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                int data;
                while ((data = pr.read()) != -1) {
                    System.out.print((char) data);
                }
                pr.close();
                
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}

