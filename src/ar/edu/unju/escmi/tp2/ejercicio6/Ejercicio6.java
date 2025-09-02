package ar.edu.unju.escmi.tp2.ejercicio6;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Ingresar el radio de un circulo
        float radio;
        System.out.println("Ingrese el radio del circulo: ");
        radio = scanner.nextInt();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo es: " + area);
    }
    
}
