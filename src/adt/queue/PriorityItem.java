package adt.queue;

public class PriorityItem {
    private int priority;
    private Patient data;
    private PriorityItem next;

    public PriorityItem(Patient data, int priority) {
        this.data = data;
        this.priority = priority;
    }

    public Patient getData() {
        return data;
    }

    public void setData(Patient data) {
        this.data = data;
    }

    public PriorityItem getNext() {
        return next;
    }

    public void setNext(PriorityItem next) {
        this.next = next;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}