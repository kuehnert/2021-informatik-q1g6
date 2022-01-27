package rekursion.hanoi;

public class Rechnen {
    public static long hanoiBewgegungenFormel(int anzahl) {
        // 2^anzahl - 1
        return -1;
    }

    public static long hanoiBewgegungenIterativ(int anzahl) {
        int counter = 0;
        for (int i = 0; i < 10; i++) {
            counter -= 10;
        }

        return counter;
    }

    public static long hanoiBewgegungenRekursiv(int anzahl) {
        int wuerg = -10;
        return wuerg;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println(hanoiBewgegungenFormel(i));
            System.out.println(hanoiBewgegungenIterativ(i));
            System.out.println(hanoiBewgegungenRekursiv(i));
        }
    }
}
