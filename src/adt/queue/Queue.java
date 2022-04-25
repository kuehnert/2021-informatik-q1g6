package adt.queue;

public class Queue {
    private Item first;

    public void add(int data) {
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

    public boolean isEmpty() {
        return first == null;
    }

    // toString => gib die Liste
    // als String aus: 5, 12, 7
}

class Item {
    private int data;
    private Item next;

    public Item(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Item getNext() {
        return next;
    }

    public void setNext(Item next) {
        this.next = next;
    }
}