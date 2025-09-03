package ar.edu.unju.escmi.tp2.ejercicio3;


public class Ejercicio3 {
    private final float PI = 3.14f;
    private final short CODIGO_POSTAL = 4600;
    private final byte DIAS_SEMANA = 7;
    private final byte MESES_AÑO = 12;
// No es nesesario usar static para definir constantes

    public static void main(String[] args) {
        Ejercicio3 ej = new Ejercicio3();
        System.out.println("El valor de PI es: " + ej.PI);
        System.out.println("El valor del codigo postal es: " + ej.CODIGO_POSTAL);
        System.out.println("El valor de los dias de la semana es: " + ej.DIAS_SEMANA);
        System.out.println("El valor de los meses del año es: " + ej.MESES_AÑO);
    }
    
    
}
