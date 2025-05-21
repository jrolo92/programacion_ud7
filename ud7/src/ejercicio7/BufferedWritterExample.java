package ejercicio7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// Mejora la eficiencia de FileWriter al usar un búfer

public class BufferedWritterExample {
	 public static void main(String[] args) throws IOException {
	        BufferedWriter bw = null;
	        try {
	            bw = new BufferedWriter(new FileWriter("archivo.txt"));
	            bw.write("Texto con búfer.");
	            bw.newLine();
	            bw.write("Otra línea.");
	            System.out.println("Texto escrito con búfer.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            bw.close();
	        }
	    }
}