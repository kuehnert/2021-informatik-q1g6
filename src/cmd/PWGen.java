package cmd;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PWGen {
    private static final String[] WOERTER = {"Poempel", "Strasse", "...."};
    // 1. Rein Zufällig: cdas!7672eghHD?GdbasHDSJ
    private static final char[] ZEICHEN = "ABCDXYZ123".toCharArray();
    // 2. Links-rechts: 3lapckwjs
    private static final char[] ZEICHEN_L = "QWE".toCharArray();
    private static final char[] ZEICHEN_R = "IOP".toCharArray();

    private static String methode3() {
        String filename = "media/woerter.txt";
        String woerterStr = FileLoader.load(filename);
        System.out.println(woerterStr);
        return "password";
    }

    // 3. Wörter kombinieren: Poempel2Strasse, lift-citrus-banana
    public static void main(String[] args) {
        System.out.println(methode3());
    }
}
