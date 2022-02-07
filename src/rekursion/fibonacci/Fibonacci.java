package rekursion.fibonacci;

public class Fibonacci {
    public static long fibonacciIterativ(int n) {
        return -1;
    }

    public static long fibonacciRekursiv(int n) {
        return -1;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.printf("%2d: Iterativ: %d, Rekursiv: %d%n", i, fibonacciIterativ(i), fibonacciRekursiv(i));
        }
    }
}
