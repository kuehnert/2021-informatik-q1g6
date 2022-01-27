package rekursion.hanoi;

public class TuermeAlt {
    private static int _counter = Integer.MIN_VALUE;
    private static int _anzahl = Integer.MIN_VALUE;

    // Rekursive Methode (privat)
    private static void _hanoi(int anzahl, String start, String destination, String temp) {
        if (anzahl > 1) {
            _hanoi(anzahl - 1, start, temp, destination);
        }

        _counter += 1;
        String s;
        if (anzahl == _anzahl) {
            s = "MITTE ";
        } else {
            s = "      ";
        }

        System.out.println(s + _counter + ". Verschiebe Scheibe von *" + start + "* nach *" + destination + "*" + " gesamtAnzahl=" + _anzahl);

        if (anzahl > 1) {
            _hanoi(anzahl - 1, temp, destination, start);
        }
    }

    public static void hanoi(int anzahl) {
        _counter = 0;
        _anzahl = anzahl;
        _hanoi(anzahl, "Turm 1", "Turm 3", "Turm 2");
        System.out.println("Bewegungen insgesamt: " + _counter);
    }
}
