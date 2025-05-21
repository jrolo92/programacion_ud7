**Ejercicio 7.**

1. FileWriter
2. BufferedWriter
3. CharArrayWriter
4. PrintWriter
5. StringWriter
6. PipedWriter
7. FileReader
8. BufferedReader
9. LineNumberReader
10. CharArrayReader
11. StringReader
12. PipedReader


- Investiga cada una de estas clases y crea un ejemplo para explicar su funcionamiento al resto de la clase.

Todas estas clases pertenecen al paquete java.io y se utilizan para la manipulación de flujos de caracteres en Java.

- Elabora la jerarquía de clases e indica los paquetes a los que pertenecen.

java.io

` `│
` `├── Writer
` `│    ├─── FileWriter
` `│    ├─── BufferedWriter
` `│    ├─── CharArrayWriter
` `│    ├─── PrintWriter
` `│    ├─── StringWriter
` `│    ├─── PipedWriter
` `│
` `├── Reader
`     `├─── FileReader
`     `├─── BufferedReader
`     `├─── LineNumberReader
`     `├─── CharArrayReader
`     `├─── StringReader
`     `├─── PipedReader

- Añade al ejemplo la utilización de los métodos mark y reset, explicando para qué los usas.

Estos métodos se usan en clases de entrada para marcar una posición en mitad del flujo de datos (mark()) y para volver a esa marca cuando sea necesario (reset()).
