package rekursion;

public class Rekursion {
    // Endlosrekursion (vgl. Endlosschleife
    // In der Praxis ist die Rekursionstiefe von der Größe des Stacks abhängig
    // mit anderen Worten: Rekursion bricht ab, wenn der Stapel voll ist
    static void rekursion01() {
        System.out.println(".");
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
            rekursion03(n - 1);
        }
    }

    static void rekursion04(int n) {
        if (n == 0) {
            System.out.println("Stopp!");
        } else {
            rekursion04(n - 1);
            System.out.println(n);
        }
    }

    static void rekursion05(int n) {
        if (n == 0) {
            System.out.println("Stopp!");
        } else {
            System.out.println(n);
            rekursion05(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        // rekursion01();
        // rekursion04(5);
        rekursion05(5);
    }
}
