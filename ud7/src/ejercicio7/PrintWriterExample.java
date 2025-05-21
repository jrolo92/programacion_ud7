package ejercicio7;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// Permite imprimir datos en un flujo de salida

public class PrintWriterExample {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter("salida.txt"));
            pw.println("Impreso con PrintWriter!");
            System.out.println("Texto impreso en archivo");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            pw.close();
        }
    }
}
