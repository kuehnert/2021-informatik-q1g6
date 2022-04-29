package adt.beispiele;

import java.util.Random;

public class Kunde {
    public static Random random = new Random();
    public static final String[] NAMEN = {"Dirk", "Franz", "Willi", "Simon", "Luca", "Peter", "Fritz", "Max", "Magnus"
            , "Ansgar", "Dieter", "Bruno", "Petra", "Simone", "Anna", "Anne", "Annalena", "Wilhelmine", "Kathrin"};

    private String name;
    private String sorte;
    private long queuedAt;

    public static String getZufallsname() {
        return NAMEN[random.nextInt(NAMEN.length)];
    }

    public Kunde(String name, String sorte) {
        setName(name);
        setSorte(sorte);
        queuedAt = System.currentTimeMillis();
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

    public long getQueuedAt() {
        return queuedAt;
    }

    public long getQueuedForInSeconds() {
        return (System.currentTimeMillis() - queuedAt) / 1000;
    }

    @Override
    public String toString() {
        return name + " will " + sorte;
    }
}
