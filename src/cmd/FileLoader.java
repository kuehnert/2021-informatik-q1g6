package cmd;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileLoader {
    public static void save(String filename, String data) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            writer.write(data);
            writer.close();
        } catch (IOException e) {
            System.out.println("FEHLER: Beim Speichern von " + filename + " ist ein Fehler aufgetreten.");
        }
    }

    public static String load(String filename) {
        String input = null;

        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("FEHLER: Datei " + filename + " nicht gefunden!");
            return null;
        }

        try {
            input = new String(Files.readAllBytes(Path.of(filename)));
        } catch (IOException e) {
            System.out.println("FEHLER beim Lesen der Datei " + filename + "!");
            return null;
        }

        return input;
    }
}