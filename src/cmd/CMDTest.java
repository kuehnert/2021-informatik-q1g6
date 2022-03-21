package cmd;

public class CMDTest {
    public static void main(String[] args) {
        int a = -1, b = -1;

        if (args.length != 2) {
            System.err.println("Bitte gib zwei Zahlen an");
            System.exit(1);
        }

        try {
            a = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.err.printf("Konnte %s nicht in eine Zahl umwandeln.", args[0]);
            System.exit(1);
        }

        try {
            b = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.err.printf("Konnte %s nicht in eine Zahl umwandeln.", args[1]);
            System.exit(1);
        }

        // Es ist alles gut gegangen
        System.out.println(a + b);
    }
}

