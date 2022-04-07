package sortieren.test_sorting;

import sortieren.InsertionSort;

import java.util.Arrays;

public class TestInsertionSort {
    public static void testStatic() {
        int[] a = {5, 10, 15, 7, 3, 2, 9, 420, -73, -3000};
        int[] correct = {-3000, -73, 2, 3, 5, 7, 9, 10, 15, 420};
        InsertionSort sorter = new InsertionSort(a);
        sorter.sortieren();
        if (Arrays.equals(a, correct)) {
            System.out.print(".");
        } else {
            System.out.println("testStatic:");
            System.out.println("result:    " + Arrays.toString(a));
            System.out.println("expected:  " + Arrays.toString(correct));
        }
    }

    public static void testStatic2() {
        int[] a = {1, 2, 3, 4, 5};
        int[] correct = {1, 2, 3, 4, 5};
        InsertionSort sorter = new InsertionSort(a);
        sorter.sortieren();
        if (Arrays.equals(a, correct)) {
            System.out.print(".");
        } else {
            System.out.println("testStatic:");
            System.out.println("result:    " + Arrays.toString(a));
            System.out.println("expected:  " + Arrays.toString(correct));
        }
    }

    public static void main(String[] args) {
        testStatic();
        testStatic2();

    }
}
