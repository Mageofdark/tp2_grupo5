package ar.edu.unju.escmi.tp2.ejercicio9;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un año: ");
        int anio = scanner.nextInt();
        Boolean Bisiesto = false;
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            Bisiesto = true;
        }
        if (Bisiesto==true) {
            System.out.println("El año " + anio + " es bisiesto");
        }
        else {
            System.out.println("El año " + anio + " no es bisiesto");
        }
        scanner.close();
    }
}