package ar.edu.unju.escmi.tp2.ejercicio4;

public class Ejercicio4 {
    public static void main(String[] args) {
        int num = 3;
        double resultado = Math.pow((num * (num + 1) / 2), 2);

        System.out.println("El resultado de (num * (num + 1) / 2)^2 con num = " + num + " es: " + resultado);

    }
}

/* El método pow() de la clase Math se usa para calcular potencias en Java.
   Sintaxis: Math.pow(base, exponente)
   Parámetros:
    - base: el número que vamos a elevar
    - exponente: el número al que vamos a elevar la base
 Va a retornar: un valor de tipo double con el resultado de base^exponente
 Ejemplito: Math.pow(3, 2) devuelve 9.0 (porque 3^2 = 9)
 */