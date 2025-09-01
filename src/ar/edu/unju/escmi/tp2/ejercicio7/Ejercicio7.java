package ar.edu.unju.escmi.tp2.ejercicio7;

public class Ejercicio7 {

    public static void main(String[] args) {
        int a = 30;
        double b = 1.5;

        System.out.println(a++);  // se muestra el valor de a ( 30 ) y luego se le incrementa 1
        System.out.println(a);    // muestra el valor de a ( 31 )
        System.out.println(--a);  // se le disminuye 1 y luego muestra el valor por pantalla ( 30 )
        System.out.println(++b);  //se le incrementa 1 a b y luego lo muestra por pantalla ( 2.5 )
        System.out.println(b--);  // muestra el valor por pantalla ( 2.5 ) y luego se le disminuye 1
        System.out.println(b);    // muestra el valor de b en la pantalla ( 1.5 )
    }
}
