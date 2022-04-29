package adt.beispiele;

public class Kunde {
    String name;
    String sorte;

    public Kunde(String name, String sorte) {
        setName(name);
        setSorte(sorte);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSorte() {
        return sorte;
    }

    public void setSorte(String sorte) {
        this.sorte = sorte;
    }

    @Override
    public String toString() {
        return name + " will " + sorte;
    }
}
