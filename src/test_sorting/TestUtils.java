package test_sorting;

import sortieren.Utils;

import java.util.Arrays;

public class TestUtils {
    public static void testGenerateArray() {
        int[] a = Utils.generateArray(10);
        System.out.println(Arrays.toString(a));

        // a = Utils.generateArray(10_000);
        // System.out.println(Arrays.toString(a));

        // a = Utils.generateArray(1_000_000);
        System.out.println(Arrays.toString(a));
        // System.out.println("Auf die Plätze!");
        // Arrays.sort(a);
        System.out.println("Fertig!");
    }

    public static void testGenerateArraySingular() {
        int[] a = Utils.generateArraySingular(2);
        System.out.println(Arrays.toString(a));

        a = Utils.generateArraySingular(200);
        System.out.println(Arrays.toString(a));

        System.out.println("Fertig!");
    }

    public static void testGenerateArraySingular2() {
        int[] a = Utils.generateArraySingular2(2);
        System.out.println(Arrays.toString(a));

        a = Utils.generateArraySingular2(200);
        System.out.println(Arrays.toString(a));

        a = Utils.generateArraySingular2(200, 10);
        System.out.println(Arrays.toString(a));

        System.out.println("Fertig!");
    }

    public static void main(String[] args) {
        // testGenerateArray();
        // testGenerateArraySingular();
        testGenerateArraySingular2();
    }
}
