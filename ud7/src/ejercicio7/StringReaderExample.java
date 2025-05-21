package ejercicio7;

import java.io.IOException;
import java.io.StringReader;

// Lee caracteres desde un String

public class StringReaderExample {
    public static void main(String[] args) throws IOException {
        StringReader sr = null;
        try {
            sr = new StringReader("Texto en StringReader");
            int content;
            while ((content = sr.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sr.close();
        }
    }
}

