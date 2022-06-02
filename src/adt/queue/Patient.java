package adt.queue;

public class Patient {
    private String name;
    private String krankheit;

    public Patient(String name, String krankheit) {
        this.name = name;
        this.krankheit = krankheit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKrankheit() {
        return krankheit;
    }

    public void setKrankheit(String krankheit) {
        this.krankheit = krankheit;
    }

    @Override
    public String toString() {
        return String.format("%s mit %s", name, krankheit);
    }
}
