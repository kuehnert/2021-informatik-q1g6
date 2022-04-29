package adt.beispiele;

public class QueueEis {
    private Item first;

    public void enqueue(Kunde data) {
        Item newItem = new Item(data);

        if (isEmpty()) {
            first = newItem;
        } else {
            Item runner = first;

            while (runner.getNext() != null) {
                runner = runner.getNext();
            }

            runner.setNext(newItem);
        }
    }

    public Kunde dequeue() {
        if (first == null) {
            throw new IllegalStateException("Schlange ist leer");
        }

        Kunde data = first.getData();
        first = first.getNext();
        return data;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int getSize() {
        int count = 0;
        Item runner = first;

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
        Item runner = first;

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

class Item {
    private Kunde data;
    private Item next;

    public Item(Kunde data) {
        this.data = data;
    }

    public Kunde getData() {
        return data;
    }

    public void setData(Kunde data) {
        this.data = data;
    }

    public Item getNext() {
        return next;
    }

    public void setNext(Item next) {
        this.next = next;
    }
}