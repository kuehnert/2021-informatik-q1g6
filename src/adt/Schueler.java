package adt;

public class Schueler {
    String nachname;
    String vorname;
    int alter;

    @Override
    public String toString() {
        return String.format("%s, %s (%d Jahre)", nachname, vorname, alter);
    }

    public static void main(String[] args) {
        Schueler nichtLuis = new Schueler();
        nichtLuis.nachname = "Trump";
        nichtLuis.vorname = "Donald";
        nichtLuis.alter = 77;

        System.out.println(nichtLuis);
    }
}
