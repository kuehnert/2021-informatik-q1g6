package rekursion.hanoi;

public class TuermeVonHanoi {
    // Rekursive Methode (privat)
    private static void _hanoi(int anzahl, String start, String destination, String temp) {
        if (anzahl > 1) {
            _hanoi(anzahl - 1, start, temp, destination);
        }

        System.out.println("Verschiebe Scheibe von *" + start + "* nach *" + destination + "*");

        if (anzahl > 1) {
            _hanoi(anzahl - 1, temp, destination, start);
        }
    }

    // Startermethode (öffentlich)
    public static void hanoi(int anzahl) {
        _hanoi(anzahl, "Turm 1", "Turm 3", "Turm 2");
    }
}
