
import java.util.Random;
import java.util.Scanner;

public class Adivinanza {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);
        int intentos = 5;
        int numeroUsuario;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba un numero entre 0 y 100");

        while (intentos != 0){

            numeroUsuario = teclado.nextInt();
            if (numeroUsuario != numeroAleatorio){
                intentos--;
                System.out.println("Intentos: " + intentos);

                if (numeroUsuario < numeroAleatorio){
                    System.out.println("Numero Aleatorio es mayor al digitado");
                } else {
                    System.out.println("Numero Aleatorio es menor al digitado");
                }
            }

            else {
                System.out.println("Felicidades. Numero correcto");
                break;
            }

            if (intentos == 0) {
                System.out.println("Se acabaron los intentos. Vuelve a intentarlo. El numero era: " + numeroAleatorio);
            }
        }
    }
}
