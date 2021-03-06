package adt.stack;

public class Stack<T> {
    Item<T> top;

    public Stack() {
        top = null;
    }

    public void push(T data) {
        Item<T> newItem = new Item<T>(data);
        newItem.setNext(top);
        top = newItem;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        } else {
            return top.getData();
        }
    }

    public String toString() {
        String output = "[ ";
        Item<T> runner = top;

        while (runner != null) {
            if (runner != top) {
                output += ", ";
            }

            output += runner.getData();
            runner = runner.getNext();
        }

        return output + " ]";
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        } else {
            T data = top.getData();
            top = top.getNext();
            return data;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }
}

class Item<T> {
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