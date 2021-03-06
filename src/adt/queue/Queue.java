package adt.queue;

public class Queue<T> {
    protected Item<T> first;

    public void enqueue(T data) {
        Item<T> newItem = new Item<T>(data);

        if (isEmpty()) {
            first = newItem;
        } else {
            Item<T> runner = first;

            while (runner.getNext() != null) {
                runner = runner.getNext();
            }

            runner.setNext(newItem);
        }
    }

    public T dequeue() {
        if (first == null) {
            throw new IllegalStateException("Schlange ist leer");
        }

        T data = first.getData();
        first = first.getNext();
        return data;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int getSize() {
        int count = 0;
        Item<T> runner = first;

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
        Item<T> runner = first;

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