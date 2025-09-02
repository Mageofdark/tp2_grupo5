package ar.edu.unju.escmi.tp2.ejercicio16;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese n: ");
        int n = 0;
        do{
            n = scanner.nextInt();
            if (n < 5 || n > 10)
                System.out.println("El numero debe estar en un rango [5, 10]");
        } while (n < 5 || n > 10);

        System.out.println("Ingrese nombre de persona: ");
        String[] nombres = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            String nombre = scanner.next();
            nombres[i] = nombre;
        }

        System.out.println("El array es:");
        for (int i = 0; i < n; i++)
            System.out.print(nombres[i] + " ");
        System.out.println();
    
        System.out.println("El array comenzando desde la ultima posicion es: ");
        for (int i = n - 1; i >= 0; i--)
            System.out.print(nombres[i] + " ");
        System.out.println();
    }


}
