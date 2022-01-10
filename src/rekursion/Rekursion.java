package rekursion;

public class Rekursion {
    // Endlosrekursion (vgl. Endlosschleife
    // In der Praxis ist die Rekursionstiefe von der Größe des Stacks abhängig
    // mit anderen Worten: Rekursion bricht ab, wenn der Stapel voll ist
    static void rekursion01() {
        rekursion01();
    }

    static void rekursion02() {
        // Abbruchbedingung
        // Trivialfall / Elementarfall ==> NICHT-Rekursiver Fall
        if (true) {
            System.out.println("Keine Rekursion mehr");
        } else {
            rekursion02();
        }
    }

    static void rekursion03(int n) {
        // Abbruchbedingung
        // Trivialfall / Elementarfall ==> NICHT-Rekursiver Fall
        if (n == 0) {
            System.out.println("Stopp!");
        } else {
            System.out.println(n);
            rekursion03(n-1);
        }
    }

    public static void main(String[] args) {
        rekursion03(5);
    }
}

