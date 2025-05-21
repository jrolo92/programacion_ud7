package ejercicio10;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class main10 {

	public static void main(String[] args) throws IOException {
		Persona persona1 = new Persona ("Tommy", "Vercetti", 35, 1.72);
		
//		Serializar:
//		Crear fichero
		File file = new File ("C:\\Users\\usuario\\persona.bin");
//		Flujo fichero
		FileOutputStream fos = new FileOutputStream (file);
//		Flujo objeto
		ObjectOutputStream oos = new ObjectOutputStream (fos);
//		Cerramos flujo
		oos.close();
		fos.close();
	}

}
