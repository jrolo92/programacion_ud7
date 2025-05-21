package ejercicio7;

import java.io.FileReader;
import java.io.IOException;

// Se usa para leer caracteres desde un archivo

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        try {
            fr = new FileReader("archivo.txt");
            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fr.close();
        }
    }
}

