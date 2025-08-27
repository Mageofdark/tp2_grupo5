import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese n: ");
        int n = 0;
        do{
            n = sc.nextInt();
            if(n < 3 || n > 10)
                System.out.println("Error, el numero debe estar en un rango [3, 10]");
        }while(n < 3 || n > 10);

        System.out.println("Ingrese " + n + " numeros: ");
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Numero " + (i + 1) + ": ");
            int x = sc.nextInt();
            array[i] = x;
        }  
        
        long sum = 0;
        for(int i = 0; i < n; i++) sum += array[i];

        System.out.println("El array es: ");
        for(int i = 0; i < n; i++)
            System.out.print(array[i] + " ");
        System.out.println();

        System.out.println("La suma total es: " + sum);

        sc.close();
    }
}
