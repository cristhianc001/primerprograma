import java.sql.SQLOutput;
import java.util.Scanner;

public class Lectura {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu pelicula favorita");
        String pelicula = teclado.nextLine();
        System.out.println("Ahora escribe la fecha de lanzamiento");
        int fecheDeLanzamiento = teclado.nextInt();
        System.out.println("Que nota le das a esta pelicula");
        double nota = teclado.nextDouble();

        System.out.println(pelicula);
        System.out.println(fecheDeLanzamiento);
        System.out.println(nota);
    }
}
