package adt.queue;

public class QueueObject {
    private ItemObject first;

    public void enqueue(Object data) {
        ItemObject newItem = new ItemObject(data);

        if (isEmpty()) {
            first = newItem;
        } else {
            ItemObject runner = first;

            while (runner.getNext() != null) {
                runner = runner.getNext();
            }

            runner.setNext(newItem);
        }
    }

    public Object dequeue() {
        if (first == null) {
            throw new IllegalStateException("Schlange ist leer");
        }

        Object data = first.getData();
        first = first.getNext();
        return data;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int getSize() {
        int count = 0;
        ItemObject runner = first;

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
        ItemObject runner = first;

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

class ItemObject {
    private Object data;
    private ItemObject next;

    public ItemObject(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ItemObject getNext() {
        return next;
    }

    public void setNext(ItemObject next) {
        this.next = next;
    }
}    

