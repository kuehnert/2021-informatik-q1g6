package sortieren;

import java.util.Arrays;

// auch bekannt als Selection Sort
public class SelectionSort {
    private int[] a;

    public SelectionSort(int[] a) {
        this.a = a;
    }

    // in-place Sortieren
    public void sortieren() {
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
}
