package rekursion;

public class TuermeVonHanoi {
    public static void hanoi(int anzahl, String start, String destination, String temp) {
        if (anzahl > 1) {
            hanoi(anzahl - 1, start, temp, destination);
        }

        System.out.println("Verschiebe Scheibe von *" + start + "* nach *" + destination + "*");

        if (anzahl > 1) {
            hanoi(anzahl - 1, temp, destination, start);
        }
    }

    public static void main(String[] args) {
        hanoi(10, "Turm 1", "Turm 3", "Turm 2");
    }
}
