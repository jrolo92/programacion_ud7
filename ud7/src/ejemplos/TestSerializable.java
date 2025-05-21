package ejemplos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerializable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		Creamos objeto
		ObjetoSerializable o1 = new ObjetoSerializable (1, 1, 1);

//		SERIALIZAR:
//		Creamos fichero
		File file = new File ("C:\\Users\\usuario\\serializable.bin");
//		Flujo del fichero
		FileOutputStream fos = new FileOutputStream(file);
//		Flujo del objeto
		ObjectOutputStream oos = new ObjectOutputStream (fos);
//		Serializamos objeto
		oos.writeObject(o1);
		
//		Cerramos flujos (en orden contrario al que se han abierto)
		oos.close();
		fos.close();
		
//		DESERIALIZAR:
//		Flujo del fichero
		FileInputStream fis = new FileInputStream("C:\\Users\\usuario\\serializable.bin");
//		Flujo del objeto
		ObjectInputStream ois = new ObjectInputStream(fis);
//		Deserializamos. Hay que hacer casting a la clase serializable
		ObjetoSerializable o1Deserializado = (ObjetoSerializable)ois.readObject();
		
//		Cerramos flujos (en orden contrario al que se han abierto):
		ois.close();
		fis.close();
		
//		Comprobamos los atributos:
		System.out.println(o1Deserializado.getAtributo1());
		System.out.println(o1Deserializado.getAtributo2());
		System.out.println(o1Deserializado.getAtributo3());
		
	}

}
