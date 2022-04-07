package anderes.cmd;

import java.util.*;

public class PWGen {
    private static Random gen = new Random();
    private static final char[] ZEICHEN =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!§$%&/()=?".toCharArray();

    // 1. Rein Zufällig: cdas!7672eghHD?GdbasHDSJ
    static String methode1(int laenge) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < laenge; i++) {
            output.append( ZEICHEN[(int) gen.nextInt(ZEICHEN.length)] );
        }

        return output.toString();
    }

    // 2. Links-rechts: 3lapckwjs
    private static final char[][] LRZEICHEN = {"QWERTASDFGYXCV".toCharArray(), "ZUIOPHJKLÖÄBNM,.-".toCharArray()};
    static String methode2(int laenge) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < laenge; i++) {
            char[] z = LRZEICHEN[i%2];
            output.append( z[(int) gen.nextInt(z.length)] );
        }

        return output.toString();
    }

    // 3. Wörter kombinieren: Poempel2Strasse, lift-citrus-banana
    private static String methode3(int anzahl) {
        String filename = "media/woerter.txt";
        String woerterStr = FileLoader.load(filename);
        String[] woerter = woerterStr.split("\n");
        String output = woerter[(int) gen.nextInt(woerter.length)];

        for (int i = 1; i < anzahl; i++) {
            output += String.format("%02d%s", gen.nextInt(100), woerter[(int) gen.nextInt(woerter.length)]);
        }

        return output;
    }

    public static void main(String[] args) {
        // laenge: 8-20
        // methode: 1, 2, 3 OPTIONAL 1
        System.out.println(methode3(20));
    }
}
