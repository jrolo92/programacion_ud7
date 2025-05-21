


Ejercicio 6: Investiga cada una de estas clases y crea un ejemplo para explicar su funcionamiento al resto de la clase.

|**Clase**|**Descripción**|**Ejemplo**|
| :- | :- | :- |
|**FileOutputStream**|Escribe bytes en un archivo.|new FileOutputStream("archivo.txt")|
|**BufferedOutputStream**|Mejora la eficiencia al escribir en un flujo.|new BufferedOutputStream(new FileOutputStream("archivo.txt"))|
|**DataOutputStream**|Escribe tipos de datos primitivos de Java.|new DataOutputStream(new FileOutputStream("archivo.dat"))|
|**ByteArrayOutputStream**|Escribe bytes en un array en memoria.|new ByteArrayOutputStream()|
|**PrintStream**|Permite imprimir representaciones de objetos.|new PrintStream(new FileOutputStream("archivo.txt"))|
|**PipedOutputStream**|Escribe datos en un canal para comunicación entre hilos.|new PipedOutputStream()|
|**FileInputStream**|Lee bytes desde un archivo.|new FileInputStream("archivo.txt")|
|**BufferedInputStream**|Mejora la eficiencia al leer desde un flujo.|new BufferedInputStream(new FileInputStream("archivo.txt"))|
|**DataInputStream**|Lee tipos de datos primitivos de Java.|new DataInputStream(new FileInputStream("archivo.dat"))|
|**ByteArrayInputStream**|Lee bytes desde un array en memoria.|new ByteArrayInputStream(bytesArray)|
|**SequenceInputStream**|Combina múltiples flujos de entrada en uno solo.|new SequenceInputStream(new FileInputStream("file1.txt"), new FileInputStream("file2.txt"))|
|**PipedInputStream**|Lee datos desde un canal de comunicación entre hilos.|new PipedInputStream()|


Ejercicio 7

Investiga cada una de estas clases y crea un ejemplo para explicar su funcionamiento al resto de la clase.


|**Clase**|**Descripción**|**Ejemplo**|
| :- | :- | :- |
|**FileWriter**|Escribe caracteres en un archivo.|new FileWriter("archivo.txt")|
|**BufferedWriter**|Escribe caracteres con un búfer para mayor eficiencia.|new BufferedWriter(new FileWriter("archivo.txt"))|
|**CharArrayWriter**|Escribe caracteres en un array en memoria.|new CharArrayWriter()|
|**PrintWriter**|Permite imprimir datos en un flujo de salida.|new PrintWriter(new FileWriter("archivo.txt"))|
|**StringWriter**|Escribe caracteres en un StringBuffer.|new StringWriter()|
|**PipedWriter**|Se usa para comunicación entre hilos.|new PipedWriter()|
|**FileReader**|Lee caracteres desde un archivo.|new FileReader("archivo.txt")|
|**BufferedReader**|Lee caracteres con un búfer para mayor eficiencia.|new BufferedReader(new FileReader("archivo.txt"))|
|**LineNumberReader**|Extiende BufferedReader y permite obtener números de línea.|new LineNumberReader(new FileReader("archivo.txt"))|
|**CharArrayReader**|Lee caracteres desde un array en memoria.|new CharArrayReader(arrayDeChars)|
|**StringReader**|Lee caracteres desde un String.|new StringReader("Texto en memoria")|
|**PipedReader**|Se usa junto con PipedWriter para comunicación entre hilos.|new PipedReader()|





Especificadores de formato para printf:

|**Especificador**|**Significado**|**Ejemplo**|
| :-: | :- | :- |
|**%d**|Número entero|System.out.printf("Número: %d", 42);|
|**%f**|Número decimal (punto flotante)|System.out.printf("Precio: %.2f", 9.99);|
|**%c**|Carácter|System.out.printf("Letra: %c", 'A');|
|**%s**|Cadena de caracteres|System.out.printf("Nombre: %s", "Juan");|
|**%n**|Nueva línea (igual que \n)|System.out.printf("Hola%nMundo");|

