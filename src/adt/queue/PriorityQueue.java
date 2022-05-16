package adt.queue;

public class PriorityQueue {
    private PriorityItem first;

    /*
    In einer Praxisgemeinschaft wird für jeden behandelnden Arzt eine eigene Warteschlange verwaltet. Wird ein Arzt (7)
zu einem Notfall gerufen, übernimmt der Kollege dessen Patienten.
Programmieren Sie diefolgende Methode der Klasse PriorityQueue: void addQueue(PriorityQueue otherQueue),
die in eine bestehende Prioritätenwarteschlange eine andere Prioritätenwarteschlange unter Beibehaltung der
Ordnung einfügt
     */

    public void enqueue(Patient data, int priority) {
        PriorityItem newItem = new PriorityItem(data, priority);

        if (isEmpty()) {
            first = newItem;
        } else if (first.getPriority() < priority) {
            newItem.setNext(first);
            first = newItem;
        } else {
            PriorityItem runner = first;

            while (runner.getNext() != null && runner.getNext().getPriority() >= priority) {
                runner = runner.getNext();
            }

            newItem.setNext(runner.getNext());
            runner.setNext(newItem);
        }
    }

    public Patient dequeue() {
        if (first == null) {
            throw new IllegalStateException("Schlange ist leer");
        }

        Patient data = first.getData();
        first = first.getNext();
        return data;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int getSize() {
        int count = 0;
        PriorityItem runner = first;

        while (runner != null) {
            count++;
            runner = runner.getNext();
        }

        return count;
    }

    // toString => gib die Liste
    // als String aus: 5, 12, 7
    public String toString() {
        String output = "[ ";
        PriorityItem runner = first;

        while (runner != null) {
            if (runner != first) {
                output += ", ";
            }

            output += runner.getData();
            runner = runner.getNext();
        }

        return output + " ]";
    }
}
