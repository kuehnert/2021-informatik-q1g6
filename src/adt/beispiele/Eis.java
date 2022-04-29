package adt.beispiele;

import java.util.Random;

public class Eis {
    public static Random random = new Random();

    public static String[] SORTEN = {"Ananas", "Amarena-Kirsche", "After Eight", "Aprikose", "Banane", "Buttermilch",
            "Brombeere", "Cappuccino", "Cookie", "Dunkle Schokolade", "Eierlikör", "Erdbeere", "Haselnuss", "Himbeere"
            , "Joghurt", "Johannisbeere", "Kaffee", "Karamell", "Kinderschokolade", "Kirsche", "Kokosnuss", "Mango",
            "Matcha", "Malaga", "Maracuja", "Nougat", "Orange", "Pfirsich", "Raffaello", "Rocher", "Schokolade",
            "Schoko-Chilli", "Stachelbeere", "Stracciatella", "Tiramisù", "Vanille", "Walnuss", "Waldmeister", "Weiße"
            + " Schokolade"};

    public static String getZufallseis() {
        return SORTEN[random.nextInt(SORTEN.length)];
    }
}
