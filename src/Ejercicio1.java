import java.util.Scanner;

public class Ejercicio1 {
    public static void main (String[] args){
        int C1, C2, C3, C4, S, P;  // Declaro las variables de tipo entero

        Scanner leer = new Scanner(System.in); // preparo el programa para leer desde el teclado

        System.out.print("Introduce el primer número ");

        C1 = leer.nextInt();

        System.out.print("Introduce el segundo número ");
        C2 = leer.nextInt();

        System.out.print("Introduce el tercero número ");
        C3 = leer.nextInt();

        System.out.print("Introduce el cuarto número ");
        C4 = leer.nextInt();

        S = C1 + C2 + C3 + C4;  // Suma de todas las notas

        P = S / 4;

        System.out.println("El resultado de la media es:" +P);


    }

}
