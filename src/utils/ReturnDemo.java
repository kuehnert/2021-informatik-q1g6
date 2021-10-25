package utils;

public class ReturnDemo {
    public int lS(int[] a, int s) {
        int gefunden = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == s) gefunden = i;
        }

        return gefunden;
    }

    // 1. return beendet Methode brutal und sofort
    // 2. break beendet nur die Schleife, Rest der Methode wird ausgeführt
    // 3. continue unterbricht aktuellen Schleifendurchlauf und macht mit dem nächsten Element weiter
    public static void lieblinge(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(i);

            if (a[i] % 2 != 0) {
                continue;
            }

            // .....
            System.out.println("Ich mag die Zahl " + a[i]);
        }

        System.out.println("Nach break wird das noch ausgeführt.");
    }

    public static double demoReturn(int x) {
        if (x < 0) {
            System.err.println("x must be greater than or equal to zero");
            return -1.0;
        }

        return Math.sqrt(x);
    }

    public static void main(String[] args) {
        // System.out.println("Die Wurzel aus 5 ist ... " + demoReturn(5));
        // System.out.println("Die Wurzel aus -5 ist ... " + demoReturn(-5));
        int[] zahlen = {7, 1, 2, 4, 6, 10};
        lieblinge(zahlen);
    }
}
