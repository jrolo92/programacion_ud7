package ejercicio7;

import java.io.CharArrayReader;
import java.io.IOException;

// Lee caracteres desde un array en memoria

public class CharArrayReaderExample {
    public static void main(String[] args) throws IOException {
        char[] data = "Texto en memoria".toCharArray();
        CharArrayReader car = null;
        try {
            car = new CharArrayReader(data);
            int content;
            while ((content = car.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            car.close();
        }
    }
}
