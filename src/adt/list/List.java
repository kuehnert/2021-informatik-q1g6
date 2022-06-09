package adt.list;

import adt.queue.Item;
import adt.queue.Queue;

// List erbt alle Daten und Methoden von Queue
public class List<T> extends Queue<T> {
    // Weitere Probleme: index zu groß oder Liste ist leer
    // Idee: negativer index zählt von hinten
    private Item<T> getItem(int index) {
        checkIndex(index);

        Item<T> runner = first;

        for (int i = 0; i < index; i++) {
            runner = runner.getNext();
        }

        return runner;
    }

    public T get(int index) {
        return getItem(index).getData();
    }

    private void checkIndex(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Index must be positive: " + index);
        }

        if (isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }

        if (index >= getSize()) {
            String s = String.format("Index too large (max. %d): %d", getSize(), index);
            throw new IllegalArgumentException(s);
        }
    }

    public void swap(int fromIndex, int toIndex) {
        T fromData = get(fromIndex);
        T toData = get(toIndex);
        set(fromIndex, toData);
        set(toIndex, fromData);
    }

    public void set(int index, T data) {
        getItem(index).setData(data);
    }

    public void insertAt(int index, T data) {
        if (index > getSize()) {
            String s = String.format("Index too large (max. %d): %d", getSize(), index);
            throw new IllegalArgumentException(s);
        }

        Item<T> newItem = new Item<>(data);

        if (index == 0) {
            newItem.setNext(first);
            first = newItem;
        } else {
            Item<T> pred = getItem(index-1);
            Item<T> tmp = pred.getNext();
            pred.setNext(newItem);
            newItem.setNext(tmp);
        }
    }

    public void deleteAt(int index) {
        checkIndex(index);


    }
}
