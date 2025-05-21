package ejercicio7;

import java.io.IOException;
import java.io.StringWriter;

// Escribe caracteres en un StringBuffer

public class StringWriterExample {
    public static void main(String[] args) throws IOException {
        StringWriter sw = null;
        try {
            sw = new StringWriter();
            sw.write("Texto");
            System.out.println("Datos almacenados: " + sw.toString());
        } finally {
            sw.close();
        }
    }
}