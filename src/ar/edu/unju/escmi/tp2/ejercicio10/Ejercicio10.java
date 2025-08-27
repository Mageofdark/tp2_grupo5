public class Ejercicio10 {
    public static void main(String[] args) {
        int a = 7, b = 5, c = -14;

        boolean resA = a > 3;
        boolean resB = a > c;
        boolean resC = a < c;
        boolean resD = b < c;
        boolean resE = b != c;
        boolean resF = a == 3;
        boolean resG = a * b == 15;
        boolean resH = a * b == -30;
        boolean resI = c / b < a;
        boolean resJ = c / b == -10;
        boolean resK = c / b == -4;
        boolean resL = a + b + c == 5;
        boolean resM = (a + b == 8) && (a - b == 2);
        boolean resN = (a + b == 8) || (a - b == 6);
        boolean resO = a > 3 && b > 3 && c < 3;
        boolean resP = a > 3 && b >= 3 && c < -3;

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
        System.out.println("o: " + resO);
        System.out.println("p: " + resP);
    }
}
