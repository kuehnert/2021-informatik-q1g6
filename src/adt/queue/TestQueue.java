package adt.queue;

public class TestQueue {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.isEmpty();
        System.out.println(q.getSize());
        q.enqueue(5);
        System.out.println(q.getSize());
        q.enqueue(12);
        System.out.println(q.getSize());
        q.enqueue(7);
        System.out.println(q.getSize());
        System.out.println(q.toString());;

        int wert;
        wert = q.dequeue();
        System.out.println(wert);
        System.out.println(q.getSize());
        System.out.println(q.toString());;

        wert = q.dequeue();
        System.out.println(wert);
        System.out.println(q.getSize());
        System.out.println(q.toString());;

        wert = q.dequeue();
        System.out.println(wert);
        System.out.println(q.getSize());
        System.out.println(q.toString());;

        wert = q.dequeue();
        System.out.println(wert);
        System.out.println(q.getSize());
        System.out.println(q.toString());;
    }
}
