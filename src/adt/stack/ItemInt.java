package adt.stack;

class ItemInt {
    private int data;
    private ItemInt next;

    public ItemInt(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ItemInt getNext() {
        return next;
    }

    public void setNext(ItemInt next) {
        this.next = next;
    }
}