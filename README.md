#  ¡ADIVINA EL NÚMERO! 

Este proyecto es un sencillo juego de adivinanza de números en Java. El jugador tiene que adivinar un número aleatorio entre 1 y 100 en un máximo de 5 intentos. A medida que el jugador ingresa sus respuestas, el juego da pistas sobre si el número secreto es mayor o menor que el número proporcionado.

## Cómo funciona

1. El programa genera un número aleatorio entre 1 y 100.
2. El jugador tiene 5 intentos para adivinar el número.
3. Después de cada intento, el juego indicará si el número secreto es mayor o menor que el número ingresado.
4. Si el jugador adivina correctamente, el programa felicita al jugador.
5. Si el jugador no adivina correctamente después de 5 intentos, el programa revela el número secreto.

## Instrucciones para ejecutar el programa

1. Asegúrate de tener Java instalado en tu sistema.
2. Compila el archivo fuente con el siguiente comando:
    ```bash
    javac Aplication.java
    ```
3. Ejecuta el programa usando el comando:
    ```bash
    java Aplication
    ```
4. Sigue las instrucciones en pantalla para jugar.

## Código clave

El programa utiliza las siguientes estructuras y clases clave:

- **`Random`**: Genera un número aleatorio entre 1 y 100.
- **`Scanner`**: Recibe la entrada del usuario desde la consola.
- **Estructuras de control**: Un bucle `for` para controlar el número de intentos y declaraciones `if-else` para verificar si la respuesta es correcta.

## Requisitos

- Java Development Kit (JDK) versión 8 o superior.
