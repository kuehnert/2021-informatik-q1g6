package sortieren;

public class InsertionSort {
    private int[] a;

    public InsertionSort(int[] a) {
        this.a = a;
    }

    public void sortieren() {
        // 6 1 3 5 2 4|
        for (int i = 1; i < a.length; i++) {
            int j = i;

            while (j >= 0 && a[j] < a[j-1]) {
                Utils.swap(a, j, j-1);
            }
        }
    }
}

/*
    Hausis:
    1. Vervollständigen Sie InsertionSort
    2. Durchlaufen Sie einen kompletten Sortiervorgang mithilfe des Debuggers
    3. Fügen Sie Edge-Cases zu den Testmethoden hinzu
       a) 1, 1, 1, 1, 1
       b) 5, 4, 3, 2, 1
       c) 1, 2, 3, 4, 5
 */