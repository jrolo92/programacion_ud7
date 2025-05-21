package ejercicio8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Lee y muestra el contenido del archivo en la consola

public class MostrarContenido {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("archivo.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }
    }
}
