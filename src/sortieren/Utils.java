package sortieren;

import suchen.LineareSuche;

import java.util.Arrays;

public class Utils { // DRY => Don't repeat yourself
    public static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public static int[] generateArray(int length) {
        int[] a = new int[length];
        // tertiären operator
        // <ausdruck> ? <true-wert> : <false-wert>
        int maxValue = (length < Integer.MAX_VALUE / 10) ? length * 10 : Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * maxValue);
        }

        return a;
    }

    public static int[] generateArraySingular(int length) {
        int[] a = new int[length];
        // tertiären operator
        // <ausdruck> ? <true-wert> : <false-wert>
        int maxValue = (length < Integer.MAX_VALUE / 10) ? length * 10 : Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            int x = (int) (Math.random() * maxValue);
            while (kommtSchonVor(a, x)) {
                x = (int) (Math.random() * maxValue);
            }

            a[i] = x;
        }

        return a;
    }

    public static int[] generateArraySingular2(int length) {
        int maxValue = (length < Integer.MAX_VALUE / 10) ? length * 10 : Integer.MAX_VALUE;
        return generateArraySingular2(length, maxValue);
    }

    public static int[] generateArraySingular2(int length, int maxValue) {
        if (maxValue < length) {
            throw new IllegalArgumentException("Invalid Parameter: maxValue must be greater than or equal to " +
                    "length");
        }

        int[] a = new int[length];
        var verwendet = new boolean[maxValue];
        Arrays.fill(verwendet, false);

        for (int i = 0; i < a.length; i++) {
            int x;
            do {
                x = (int) (Math.random() * maxValue);
            } while (verwendet[x]);

            a[i] = x;
            verwendet[x] = true;
        }

        return a;
    }

    private static boolean kommtSchonVor(int[] a, int gesucht) {
        // return LineareSuche.lineareSuche(a, gesucht);
        // if (LineareSuche.lineareSuche(a, gesucht) >= 0) {
        //     return false;
        // } else {
        //     return true;
        // }

        // return LineareSuche.lineareSuche(a, gesucht) >= 0 ? false : true;
        return LineareSuche.lineareSuche(a, gesucht) >= 0;
    }
}
