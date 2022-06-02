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
        enqueueItem(new PriorityItem(data, priority));
    }

    private void enqueueItem(PriorityItem newItem) {
        if (isEmpty() || first.getPriority() < newItem.getPriority()) {
            newItem.setNext(first);
            first = newItem;
        } else {
            PriorityItem runner = first;

            while (runner.getNext() != null && runner.getNext().getPriority() >= newItem.getPriority()) {
                runner = runner.getNext();
            }

            newItem.setNext(runner.getNext());
            runner.setNext(newItem);
        }
    }

    public Patient dequeue() {
        return dequeueItem().getData();
    }

    private PriorityItem dequeueItem() {
        if (first == null) {
            throw new IllegalStateException("Schlange ist leer");
        }

        PriorityItem pi = first;
        first = pi.getNext();
        pi.setNext(null);
        return pi;
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

            output += String.format("%s (%d)", runner.getData(), runner.getPriority());
            runner = runner.getNext();
        }

        return output + " ]";
    }

    public void addPriorityQueue(PriorityQueue other) {
        while (!other.isEmpty()) {
            enqueueItem(other.dequeueItem());
        }
    }
}
