package ejercicio7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Mejora la eficiencia de FileReader al usar un búfer

public class BufferedReaderExample {
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