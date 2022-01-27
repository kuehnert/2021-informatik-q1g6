package rekursion.hanoi;

public class TuermeAlt {
    private static int hanoiCounter = 0;
    private static int gesamtCounter;
    private static int gesamtAnzahl;

    // Rekursive Methode (privat)
    public static void hanoi(int anzahl, String start, String destination, String temp) {
        if (anzahl > 1) {
            hanoi(anzahl - 1, start, temp, destination);
        }

        hanoiCounter += 1;
        String s;
        if (anzahl == gesamtAnzahl) {
            s = "MITTE ";
        } else {
            s = "      ";
        }

        System.out.println(s + hanoiCounter + ". Verschiebe Scheibe von *" + start + "* nach *" + destination + "*");

        if (anzahl > 1) {
            hanoi(anzahl - 1, temp, destination, start);
        }
    }

    public static void main(String[] args) {
        System.out.println("Türme von Hanoi mit Zählen ALT");
        gesamtAnzahl = 4;
        gesamtCounter = (int) Math.pow(2, gesamtAnzahl) - 1;
        System.out.println("Wir brauchen " + gesamtCounter + " Schritte");
        hanoi(gesamtAnzahl, "Start", "Ziel", "Zwischen");
        System.out.println("Es waren " + hanoiCounter + " Schritte");
    }
}
