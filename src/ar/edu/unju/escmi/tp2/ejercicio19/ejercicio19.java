package ar.edu.unju.escmi.tp2.ejercicio19;

public class ejercicio19 {
    public static void main(String[] args) {
        String texto1="Hola";
        String texto2="Hola";
        System.out.println("texto1 == texto2: " + (texto1==texto2));
        System.out.println("texto1.equals(texto2): " + (texto1.equals(texto2)));

        String texto3=new String("Hola");

        System.out.println("texto1 == texto3: " + (texto1==texto3));
        System.out.println("texto1.equals(texto3): " + (texto1.equals(texto3)));

        System.out.println("texto2 == texto3: " + (texto2==texto3));
        System.out.println("texto2.equals(texto3): " + (texto2.equals(texto3)));
        
        // ¿Por qué texto1 == texto2 devuelve true?
        // Porque ambos apuntan a lo mismo en el string pool "Hola".

        // ¿Por qué texto1 == texto3 devuelve false?
        // Porque String texto3=new String("Hola") crea un nuevo objeto String en la memoria aunque ya exista en el string pool.

        // ¿Qué sucede cuando se utiliza el método equals() para comparar los valores?
        // El metodo equals lo que hace es comparar el contenido de los objetos y no su referencia en memoria.
    }
}
