package ejercicio10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializar {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fr = new FileInputStream("C:\\Users\\usuario\\persona.bin");
		
		ObjectInputStream ois = new ObjectInputStream(fr);
		ois.readObject();
		
		ois.close();
		fr.close();
		
	}

}
