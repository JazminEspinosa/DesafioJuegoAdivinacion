
import java.util.Random;
import java.util.Scanner;

public class Aplication{

    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);

        System.out.println("Juego ¡ADIVINA EL NUMERO!");
        System.out.println("vamos! tienes 5 intentos..");
        //System.out.println(numeroAleatorio);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe un numero entre el 1 y el 100: ");
        int numeroUsuario = scanner.nextInt();
        System.out.println(numeroUsuario);

        for (int contador = 1; contador <5 ; contador++) {
            if (numeroUsuario == numeroAleatorio) {
                System.out.println("Felicidades acertaste!! \n El numero secreto es : " + numeroAleatorio);
                break;

            } else if (numeroUsuario < numeroAleatorio) {
                System.out.println("el numero secreto es mayor");
                System.out.print("Escribe un numero entre el 1 y el 100 ");
                numeroUsuario = scanner.nextInt();
                System.out.println(numeroUsuario);
                if (numeroUsuario == numeroAleatorio) {
                    System.out.println("Felicidades acertaste!! \n El numero secreto es : " + numeroAleatorio);
                    break;
                }

            } else {
                System.out.println("el numero secreto es menor");
                System.out.print("Escribe un numero entre el 1 y el 100 ");
                numeroUsuario = scanner.nextInt();
                System.out.println(numeroUsuario);
                if (numeroUsuario == numeroAleatorio) {
                    System.out.println("Felicidades acertaste!! \n El numero secreto es : " + numeroAleatorio);
                    break;
                }

            }
            if (contador==4){
                System.out.println("Lo siento excediste el numero de intentos.\n El numero secreto era: " +numeroAleatorio);
            }
        }

    }
}

