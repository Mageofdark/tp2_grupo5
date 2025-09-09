package ar.edu.unju.escmi.tp2.ejercicio18;

public class Ejercicio18 {
    public static void main(String[] args) {
        Integer num1 = new Integer(1000);
        Integer num2 = new Integer(1000);

        System.out.println("Referencia de num1: " + System.identityHashCode(num1));
        System.out.println("Referencia de num2: " + System.identityHashCode(num2));

        if (num1 == num2) {
            System.out.println("num1 y num2 son iguales con '=='.");
        } else {
            System.out.println("num1 y num2 no son iguales con '=='.");
        }

        if (num1.equals(num2)) {
            System.out.println("num1 y num2 son iguales con 'equals()'.");
        } else {
            System.out.println("num1 y num2 no son iguales con 'equals()'.");
        }

    
        num2 = new Integer(3000);
        System.out.println("\nCambiando num2 a 3000...");
        System.out.println("Referencia de num1: " + System.identityHashCode(num1));
        System.out.println("Referencia de num2: " + System.identityHashCode(num2));

        if (num1 == num2) {
            System.out.println("Las referencias son iguales");
        } else {
            System.out.println("Las referencias NO son iguales");
        }

        if (num1.equals(num2)) {
            System.out.println("Los valores son iguales");
        } else {
            System.out.println("Los valores NO son iguales");
        }
    }
}

// Definición de la clase Integer
class Integer {
    private int value;

    public Integer() {
        this.value = 0;
    }

    public Integer(int value) {
        this.value = (int) value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Integer integer = (Integer) obj;
        return value == integer.value;
    }
}
