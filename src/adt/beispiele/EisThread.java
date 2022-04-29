package adt.beispiele;

import java.util.Random;

public class EisThread extends Thread {
    private Random random = new Random();
    private Eisdiele main;
    private boolean weiter = true;

    public EisThread(Eisdiele main) {
        this.main = main;
    }

    public void anhalten() {
        weiter = false;
    }

    private void neuerKunde() {
        String name = Kunde.getZufallsname();
        String eis = Eis.getZufallseis();

        main.anstellen(name, eis);
    }

    private void bedienen() {
        main.bedieneKunde();
    }

    @Override
    public void run() {
        super.run();

        while (weiter) {
            double r = random.nextDouble();
            if (r >= 0.5) {
                neuerKunde();
            } else if (r >= 0.3) {
                bedienen();
            }

            try {
                sleep(random.nextLong(3_000));
            } catch (InterruptedException e) {
            }
        }
    }
}
