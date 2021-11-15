package utils;

import java.util.Arrays;

public class Klausur1 {
    public static double median(int[] a) {
        int mitte = a.length / 2;

        if (a.length % 2 != 0) {
            // Länge ist ungerade
            return a[mitte];
        } else {
            int x = mitte;
            int y = mitte - 1;
            return (a[x] + a[y]) / 2.0;
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 5, 8, 10, 11};
        System.out.println(Arrays.toString(zf(a, a)));
    }

    public static int[] zf(int[] a, int[] b) {
        int c[] = Arrays.copyOf(a, a.length+b.length);

        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }

        return c;
    }
}
