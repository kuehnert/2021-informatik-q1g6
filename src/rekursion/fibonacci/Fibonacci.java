package rekursion.fibonacci;

public class Fibonacci {
    public static long fibonacciIterativ(int n) {
        long pred = 0;
        long result = 1;

        for (int i = 1; i <= n; i++) {
            long tmp = pred;
            pred = result;
            result = result + tmp;
        }

        return result;
    }

    public static long fibonacciRekursiv(int n) {
        // Trivialfall = nicht rekursiv
        if (n < 2) {
            // f(0) => 1
            // f(1) => 1
            return 1;
        } else {
            // Rekursiver Fall
            // f(n) = f(n-1) + f(n-2)
            return fibonacciRekursiv(n - 1) + fibonacciRekursiv(n - 2);
        }
    }

    public static void main(String[] args) {
        for (int i = 21; i <= 48; i++) {
            // System.out.printf("%2d: Iterativ: %d, Rekursiv: %d%n", i, fibonacciIterativ(i), fibonacciRekursiv(i));
            // System.out.printf("%2d: Iterativ: %d%n", i, fibonacciIterativ(i));
            long start = System.currentTimeMillis();
            fibonacciRekursiv(i);
            long finish = System.currentTimeMillis();
            long duration = finish - start;
            System.out.printf("%2d: Rekursiv: %d (%fs)%n", i, ???);
        }
    }
}
