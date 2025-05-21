**Ejercicio 6.**

1. FileOutputStream
2. BufferedOutputStream
3. DataOutputStream
4. ByteArrayOutputStream
5. PrintStream
6. PipedOutputStream
7. FileInputStream
8. BufferedInputStream
9. DataInputStream
10. ByteArrayInputStream
11. SequenceInputStream
12. PipedInputStream


- Investiga cada una de estas clases y crea un ejemplo para explicar su funcionamiento al resto de la clase.

Todas estas clases pertenecen al paquete java.io y forman parte del sistema de entrada/salida de Java.

- Elabora la jerarquía de clases e indica los paquetes a los que pertenecen.

java.io

│
├── OutputStream
│   ├─── FileOutputStream
│   ├─── BufferedOutputStream
│   ├─── DataOutputStream
│   ├─── ByteArrayOutputStream
│   ├─── PrintStream
│   ├─── PipedOutputStream
│
├── InputStream
`    `├─── FileInputStream
`    `├─── BufferedInputStream
`    `├─── DataInputStream
`    `├─── ByteArrayInputStream
`    `├─── SequenceInputStream
`    `├─── PipedInputStream

- ¿Eres capaz de encontrar más flujos a parte de los de la lista?

ObjectOutputStream y ObjectInputStream (para serialización de objetos).

BufferedReader y BufferedWriter (para lectura y escritura de texto).

PrintWriter (similar a PrintStream, pero más flexible para texto).

RandomAccessFile (permite acceso aleatorio a archivos).
