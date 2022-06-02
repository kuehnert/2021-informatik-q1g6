package adt.queue;

public class QueueInt {
    private ItemInt first;

    public void enqueue(int data) {
        ItemInt newItem = new ItemInt(data);

        if (isEmpty()) {
            first = newItem;
        } else {
            ItemInt runner = first;

            while (runner.getNext() != null) {
                runner = runner.getNext();
            }

            runner.setNext(newItem);
        }
    }

    public int dequeue() {
        if (first == null) {
            throw new IllegalStateException("Schlange ist leer");
        }

        int data = first.getData();
        first = first.getNext();
        return data;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int getSize() {
        int count = 0;
        ItemInt runner = first;

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
        ItemInt runner = first;

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

class ItemInt {
    private int data;
    private ItemInt next;

    public ItemInt(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ItemInt getNext() {
        return next;
    }

    public void setNext(ItemInt next) {
        this.next = next;
    }
}