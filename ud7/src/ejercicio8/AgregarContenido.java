package ejercicio8;

import java.io.FileWriter;
import java.io.IOException;

public class AgregarContenido {
    public static void main(String[] args) throws IOException {
        FileWriter fw = null;
        try {
            fw = new FileWriter("archivo.txt", true); // 'true' habilita el modo de añadir contenido
            fw.write("\n Texto añadido desde Java (2)");
            System.out.println("Texto añadido al archivo.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fw.close();
        }
    }
}
