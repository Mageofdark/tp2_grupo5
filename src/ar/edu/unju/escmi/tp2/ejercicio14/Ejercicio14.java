package ar.edu.unju.escmi.tp2.ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];

        // Este for pide números al usuario
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número para la posición " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        // va a mostrar índice y valor
        System.out.println("\nValores almacenados en el array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + " → " + numeros[i]);
        }

        scanner.close();

    }
}
