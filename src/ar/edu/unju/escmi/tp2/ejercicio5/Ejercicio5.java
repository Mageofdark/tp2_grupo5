package ar.edu.unju.escmi.tp2.ejercicio5;

public class Ejercicio5 {
    public static void main(String[] args) {
        int a = 8, b = 3, c = -5;

        int resA = a + b + c;
        int resB = 2 * b + 3 * (a - c);
        double resC = (double) a / b;
        int resD = a % b;
        double resE = (double) a / c;
        int resF = a % c;
        double resG = a * (double) b / c;
        double resH = a * ((double) b / c);
        int resI = (a * c) % b;
        int resJ = a * (c % b);
        int resK = (3 * a - 2 * b) % (2 * a - c);
        double resL = 2 * ((double) a / 5 + (4 - b * 3)) % (a + c - 2);
        double resM = ((a - 3 * b) % (double)(c + 2 * a)) / (a - c);
        int resN = a - b - c * 2;
        
        System.out.println("a: " + resA);
        System.out.println("b: " + resB);
        System.out.println("c: " + resC);
        System.out.println("d: " + resD);
        System.out.println("e: " + resE);
        System.out.println("f: " + resF);
        System.out.println("g: " + resG);
        System.out.println("h: " + resH);
        System.out.println("i: " + resI);
        System.out.println("j: " + resJ);
        System.out.println("k: " + resK);
        System.out.println("l: " + resL);
        System.out.println("m: " + resM);
        System.out.println("n: " + resN);
    }
}
