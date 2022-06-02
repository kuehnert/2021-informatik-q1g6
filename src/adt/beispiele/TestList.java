package adt.beispiele;

import adt.list.List;

public class TestList {
    public static void main(String[] args) {
        List<String> meineListe = new List<>();
        // meineListe.first = null;
        meineListe.enqueue("Hallo");
        meineListe.enqueue("Welt");
        System.out.println(meineListe.getSize());

        System.out.println(meineListe.get(1));
        System.out.println(meineListe.get(0));
        System.out.println(meineListe.get(-20));

        meineListe.dequeue();
        meineListe.dequeue();
        System.out.println(meineListe.getSize());
    }
}
