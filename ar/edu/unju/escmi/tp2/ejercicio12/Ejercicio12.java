package ar.edu.unju.escmi.tp2.ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        byte edad;
        Scanner scanner = new Scanner(System.in);

        System.out.print("ingrese la edad: ");
        edad = scanner.nextByte();

        if(edad >=1 && edad <= 12){
        System.out.println("Es un niño");
            }else if(edad >=13 && edad <= 20){
        System.out.println("Es un joven");
            }else if(edad >=21 && edad <=100){
        System.out.println("Es un adulto");
            }else {
        System.out.println("Edad no permitida");
        }

    }
}
