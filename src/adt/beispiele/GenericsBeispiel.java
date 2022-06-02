package adt.beispiele;

import adt.queue.Item;
import adt.queue.Queue;

public class GenericsBeispiel {
    public static void testItem(String[] args) {
        Item<String> meinItem = new Item<String>("dsdsd");
        System.out.println(meinItem.getData());

        Item<Kunde> kundeItem = new Item<Kunde>(new Kunde("hjh", "jhjhk"));
        System.out.println(kundeItem.getData());
        System.out.println(kundeItem.getData().getClass());
    }

    public static void main(String[] args) {
        Queue<String> queueString = new Queue<String>();
        queueString.enqueue("foo");
        queueString.enqueue("bar");
        queueString.enqueue("baz");
        System.out.println(queueString.dequeue());
        System.out.println(queueString.dequeue());
        System.out.println(queueString.dequeue());

        Queue<Kunde> queueKunde = new Queue<Kunde>();
        queueKunde.enqueue(new Kunde("Tick", "Erdbeer"));
        queueKunde.enqueue(new Kunde("Trick", "Schoko"));
        queueKunde.enqueue(new Kunde("Track", "Vanille"));
        System.out.println(queueKunde.dequeue());
        System.out.println(queueKunde.dequeue());
        System.out.println(queueKunde.dequeue());
    }
}
