package suchen;

import java.util.Scanner;

public class LineareSuche {
    Scanner scanner;
    double[] zahlen;

    public LineareSuche() {
        scanner = new Scanner(System.in);
        zahlen = new double[]{-100000000.0, 3.4, 5.0, 0.6, 19.6, 13, 6.6, 9.8};
        for (int i = 0; i < zahlen.length; i++) {
            // zahlen[i] = zahlen[i] * 6.0 / 2.0 / 2.0 / 3.0;
            System.out.println(zahlen[i]);
        }

        System.out.print("Gesuchte Zahl: ");
        double eingabe = scanner.nextDouble();

        int erg = lineareSucheTobias(zahlen, eingabe);

        // System.out.println(eingabe + " ist an Stelle " + erg + " vorhanden.");
    }

    public static void main(String[] args) {
        new LineareSuche();
    }

    /**
     * Die Methode durchsucht ein Array von Kommazahlen nach einer gesuchten Zahl Wenn die Zahl enthalten ist, gibt sie
     * den Index im Array zurück, ansonsten -1, wenn sie nicht enthalten ist.
     *
     * @param a       das Array, das durchsucht werden soll
     * @param gesucht die gesuchte Zahl
     * @return Index oder -1
     */
    public static int lineareSuche(double[] a, double gesucht) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == gesucht) {
                return i;
            }
        }

        return -1;
    }

    public static int lineareSuche(int[] a, int gesucht) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == gesucht) {
                return i;
            }
        }

        return -1;
    }

    public int lineareSucheTobias(double[] a, double gesucht) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[i]   :" + a[i] * 100_000);
            System.out.println("gesucht:" + gesucht * 100_000);
            System.out.println();

            if ((int) (a[i] * 100_000) == (int) (gesucht * 100_000)) {
                return i;
            }
        }

        return -1;
    }
}
