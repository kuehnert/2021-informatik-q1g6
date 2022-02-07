package rekursion.hanoi;

public class Rechnen {
    public static long hanoiBewegungenFormel(int anzahl) {
        // 2^anzahl - 1
        return (long) Math.pow(2, anzahl) - 1;
    }

    public static long hanoiBewegungenIterativ(int anzahl) {
        long counter = 0;

        for (int i = 0; i < anzahl; i++) {
            counter = counter + 1 + counter;
        }

        return counter;
    }

    public static long hanoiBewegungenRekursiv(int anzahl) {
        if (anzahl == 1) {
            return 1;
        } else {
            return 1 + hanoiBewegungenRekursiv(anzahl - 1) * 2;
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println("formel: " + hanoiBewegungenFormel(i));
            System.out.println("iter.: " + hanoiBewegungenIterativ(i));
            System.out.println("rek.: " +  hanoiBewegungenRekursiv(i));
        }
    }
}
