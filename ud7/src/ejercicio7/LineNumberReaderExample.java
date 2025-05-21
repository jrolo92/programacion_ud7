package ejercicio7;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

// Extiende BufferedReader y permite obtener números de línea

public class LineNumberReaderExample {
    public static void main(String[] args) throws IOException {
        LineNumberReader lnr = null;
        try {
            lnr = new LineNumberReader(new FileReader("archivo.txt"));
            String line;
            while ((line = lnr.readLine()) != null) {
                System.out.println("Línea " + lnr.getLineNumber() + ": " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            lnr.close();
        }
    }
}