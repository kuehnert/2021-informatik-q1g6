package adt.stack;

public class Stack {
    Item top;

    public Stack() {
        top = null;
    }

    public void push(int data) {
        Item newItem = new Item(data);
        newItem.setNext(top);
        top = newItem;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        } else {
            return top.getData();
        }
    }

    public String toString() {
        String output = "[ ";
        Item runner = top;

        while (runner != null) {
            if (runner != top) {
                output += ", ";
            }

            output += runner.getData();
            runner = runner.getNext();
        }

        return output + " ]";
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        } else {
            int data = top.getData();
            top = top.getNext();
            return data;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }
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