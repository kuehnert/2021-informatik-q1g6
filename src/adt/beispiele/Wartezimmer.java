package adt.beispiele;

import adt.queue.Patient;
import adt.queue.PriorityQueue;

public class Wartezimmer {
    public static void main(String[] args) {
        PriorityQueue wartezimmer = new PriorityQueue();
        wartezimmer.enqueue(new Patient("Herr Lindenberg", "Fieber"), 4);
        wartezimmer.enqueue(new Patient("Frau Adele", "Corona"), 2);
        wartezimmer.enqueue(new Patient("Frau Perry", "Bluterguss"), 5);
        System.out.println(wartezimmer.toString());
        wartezimmer.dequeue();
        wartezimmer.enqueue(new Patient("Herr Cro", "Krächzen im Hals"), 4);
        System.out.println(wartezimmer.toString());

        PriorityQueue konkurrenz = new PriorityQueue();
        konkurrenz.enqueue(new Patient("Klaus", "Malaria"), 5);
        konkurrenz.enqueue(new Patient("Felix", "Unlust"), 1);
        konkurrenz.enqueue(new Patient("Chantal", "Warddrobe Malfunction"), 4);
        konkurrenz.enqueue(new Patient("Marius", "Nasenbluten"), 2);

        wartezimmer.addPriorityQueue(konkurrenz);
        System.out.println(wartezimmer.toString());
    }
}
