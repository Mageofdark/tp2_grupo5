public class Ejercicio20 {
    public static void main(String[] args) {
        String textoOriginal = "Hoja";
        String textoModificado = textoOriginal.replace("ja", "la");
        System.out.println("Texto original: " + textoOriginal);
        System.out.println("Texto modificado: " + textoModificado);
        /*
         *  El metodo replace RETORNA un nuevo string cambiando los caracteres
         * especificados, o sea, NO modifica el objeto String original sino que
         * devuelve uno nuevo.
         */
    }
}
