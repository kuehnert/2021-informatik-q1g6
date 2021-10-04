package sortieren;

import suchen.LineareSuche;

public class Utils {
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
