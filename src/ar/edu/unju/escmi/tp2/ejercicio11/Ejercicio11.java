package ar.edu.unju.escmi.tp2.ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println(numero + " es par.");
            } else {
                System.out.println(numero + " no es par.");
            }
        }

        scanner.close();

    }
}
