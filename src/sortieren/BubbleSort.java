package sortieren;

public class BubbleSort {
    private int[] a;

    public BubbleSort(int[] a) {
        this.a = a;
    }

    public void sortieren() {
        // 6 1 3 5 2 4|
        // 1 6 3 5 2 4|
        // 1 3 6 5 2 4|
        // 1 3 5 6 2 4|
        // 1 3 5 2 6 4|
        // 1 3 5 2 4|6
        // 1 3 2 5 4|6
        // 1 3 2 4|5 6
        // 1 2 3 4|5 6
        // 1 2 3|4 5 6
        // 1 2|3 4 5 6
        // 1|2 3 4 5 6
        for (int i = a.length - 1; i > 0; i -= 1) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    Utils.swap(a, j, j+1);
                }
            }
        }
    }
}
