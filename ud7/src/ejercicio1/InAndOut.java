package ejercicio1;

import java.io.IOException;

public class InAndOut {
//Java doc PrintStream 
	public static void main(String[] args) throws IOException {
//		1. Introducir 4 chars por teclado sin usar Scanner
		System.out.println("Introduce 4 caracteres por teclado");
		char c1 = (char)System.in.read();
		char c2 = (char)System.in.read();
		char c3 = (char)System.in.read();
		char c4 = (char)System.in.read();
//		El metodo read es de tipo int por eso hacemos el casting.
//		Además va a devolver una IOException por lo que aplicamos una propagación al método.
		
//		2. Imprimir el primer char con write
//		Aquí no hace falta volver a hacer casting
		System.out.write(c1);
		System.out.flush();
		
//		3. Imprimir el segundo con print
		System.out.print(c2);
		
//		4. Imprimir el tercero con println
		System.out.println(c3);
		
//		5. Imprimir el cuarto con printf
		System.out.printf("%c", c4);
		
	}

}
