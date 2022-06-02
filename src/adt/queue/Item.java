package adt.queue;

// Generics = Generische Datentypen
public class Item<T> {
    private T data;
    private Item<T> next;

    public Item(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Item<T> getNext() {
        return next;
    }

    public void setNext(Item<T> next) {
        this.next = next;
    }
}