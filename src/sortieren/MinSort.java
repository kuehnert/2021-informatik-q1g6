package sortieren;

import java.util.Arrays;

// auch bekannt als Selection Sort
public class MinSort {
    public MinSort() {
        int[] a = {5, 10, 15, 7, 3, 2, 9, 420, -73, -3000};
        System.out.println(Arrays.toString(a));
        sortieren(a);
        System.out.println(Arrays.toString(a));
    }

    // in-place Sortieren
    public void sortieren(int[] a) {
        // äußere Schleife: trennt sortierten & unsortieren Bereich
        // beginnt bei 0, weil der sortierte Bereich zu Beginn leer ist
        for (int i = 0; i < a.length; i++) {
            // innere Schleife: sucht im unsortierten Bereich (i+1..Ende) die kleinste Zahl
            // und speichert deren Index
            int min = i;

            for (int j = i+1; j < a.length; j++) {
                // gucke ob Wert an Stelle j kleiner ist als Wert an Stelle von bisherigem Minimum
                if (a[j] < a[min]) {
                    min = j; // neues angenommenes Minimum wird zu j
                }
            }

            // vertauschen: an Stelle min ist die kleinste Zahl
            // swap(.....);
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }

    public static void main(String[] args) {
        new MinSort();
    }
}
