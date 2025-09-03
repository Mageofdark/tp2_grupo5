package ar.edu.unju.escmi.tp2.ejercicio17;

public class Ejercicio17 {
    public static void main(String[] args) {

        Integer num1 = 50;
        Integer num2 = 20;

        System.out.println("Referencia de num1 es: "+ System.identityHashCode(num1));
        System.out.println("Referencia de num2 es: "+ System.identityHashCode(num2));
        
        if(num1 == num2){
            System.out.println("Las referencias son iguales");
        } else{
            System.out.println("Las referencias no son iguales");
        }

        if(num1.equals(num2)){
            System.out.println("Los valores son iguales");
        } else{
            System.out.println("Los valores no son iguales");
        }
    }
}

/*
 * Si dos o mas objetos Integer tienen el mismo valor dentro del rango [-128, 127 ] java lo almacena en cache para ahorrar memoria y mejorar el rendimiento.
 * Por eso, en num1 == num2 sus referencias son iguales, es decir, apuntan al mismo objeto. pero si elegimos un numero afuera de ese rango
 * las referencias ya no seran iguales, sin importar si num1 y num2 tienen el mismo valor.
*/