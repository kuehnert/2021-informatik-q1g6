package adt.stack;

public class StackInt {
    ItemInt top;

    public StackInt() {
        top = null;
    }

    public void push(int data) {
        ItemInt newItem = new ItemInt(data);
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
        ItemInt runner = top;

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

