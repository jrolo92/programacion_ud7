package ejercicio7;

import java.io.CharArrayWriter;
import java.io.IOException;

// Escribe caracteres en un array en memoria

public class CharArrayWriterExample {
    public static void main(String[] args) throws IOException {
        CharArrayWriter caw = null;
        try {
            caw = new CharArrayWriter();
            caw.write("Texto en memoria.");
            System.out.println("Datos almacenados: " + caw.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            caw.close();
        }
    }
}
