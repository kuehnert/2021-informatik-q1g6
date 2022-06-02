package adt.list;

import adt.queue.Item;
import adt.queue.Queue;

// List erbt alle Daten und Methoden von Queue
public class List<T> extends Queue<T> {
    // Weitere Probleme: index zu groß oder Liste ist leer
    // Idee: negativer index zählt von hinten
    public T get(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Index must be positive: " + index);
        }

        Item<T> runner = first;

        for (int i = 0; i < index; i++) {
            runner = runner.getNext();
        }

        return runner.getData();
    }
}
