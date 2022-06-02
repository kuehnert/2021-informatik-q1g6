package adt.beispiele;

public class QueueEis {
    private ItemEis first;

    public void enqueue(Kunde data) {
        ItemEis newItem = new ItemEis(data);

        if (isEmpty()) {
            first = newItem;
        } else {
            ItemEis runner = first;

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
        ItemEis runner = first;

        while (runner != null) {
            count++;
            runner = runner.getNext();
        }

        return count;
    }

    // toString => gib die Liste
    // als String aus: 5, 12, 7
    public String toString() {
        String output = "";
        ItemEis runner = first;

        while (runner != null) {
            if (runner != first) {
                output += "\n";
            }

            output += runner.getData();
            runner = runner.getNext();
        }

        return output + "";
    }
}

class ItemEis {
    private Kunde data;
    private ItemEis next;

    public ItemEis(Kunde data) {
        this.data = data;
    }

    public Kunde getData() {
        return data;
    }

    public void setData(Kunde data) {
        this.data = data;
    }

    public ItemEis getNext() {
        return next;
    }

    public void setNext(ItemEis next) {
        this.next = next;
    }
}