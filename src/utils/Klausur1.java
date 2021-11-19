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

    public static void wonderSort(int[] a) {
        int[] zahlen = new int[10_000];
        // Arrays.fill(zahlen, 0);
        // obfuscated
        // static void w(int[]a){int[]z=new int[10_000];for(int b=0;b<a.length;z[a[b++]]++){};int p=0;for(int q=0;q<z
        // .length;q++){for(;z[q]>0;z[a[p++]=q]--){}}}

        for (int ai = 0; ai < a.length; ai++) {
            int wert = a[ai];
            zahlen[wert]++;
        }

        int ai = 0;
        for (int bi = 0; bi < zahlen.length; bi++) {
            while (zahlen[bi] > 0) {
                a[ai++] = bi; // a[ai] = bi; ai += 1
                zahlen[bi]--;
            }
        }
    }

    public static int[] zf(int[] a, int[] b) {
        int c[] = Arrays.copyOf(a, a.length + b.length);

        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }

        return c;
    }

    public static void main(String[] args) {
        int[] a = {2, 76, 2, 12, 3, 7, 3, 45, 28, 2, 10, 18};
        System.out.println(Arrays.toString(a));
        Klausur1.wonderSort(a);
        System.out.println(Arrays.toString(a));
    }
}
