package adt.queue;

import adt.beispiele.Kunde;

import java.util.Scanner;

public class TestQueueObject {
    public static void main(String[] args) {
        QueueObject q = new QueueObject();
        q.isEmpty();
        // System.out.println(q.getSize());

        /*
            Was sind die Vorteile der QueueObject vs QueueInt?
            * Einer für Alle
            * Quick & dirty
            * Kann Vorteile haben

            Was sind die Nachteile der QueueObject?
            * Verliert Typ-Sicherheit
            * Typecasting notwendig
            * Type checking aufwändig
            * Type checking unsicher
            * Datentyp-Wirrwarr
         */
        q.enqueue(5);
        q.enqueue("Hallo");
        q.enqueue(new Scanner(System.in));

        Kunde  k = new Kunde("dsasd", "fsdsdayf");

        Object x = q.dequeue();
        if (x.getClass() == Integer.class) {
            System.out.println("Zahl!");
            int summe = (Integer) x + 10;
        } else if (x.getClass() == String.class) {
            System.out.println("Ich rede zu viel");
        }

        System.out.println(x.getClass());

        System.out.println(x.toString());
        int dumm = (int) x + 5;
        System.out.println(dumm);

        Object y = q.dequeue();
        System.out.println(y.getClass());
        System.out.println(y);

        Object z = q.dequeue();
        System.out.println(z.getClass());
        System.out.println(z);
    }
}
