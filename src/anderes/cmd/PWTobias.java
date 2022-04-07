package anderes.cmd;

public class PWTobias {
    private static String sCharacters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890?!#*";
    private static char[] cCharacters = sCharacters.toCharArray();

    private static int LEFT = 0, RIGHT = 1;
    private static String[] sCharactersLR = {"qwertasdfgyxcvQWERTASDFGYXCV12345!", "zuiophjklbnmZUIOPHJKLBNM67890?*#"};
    private static char[][] cCharactersLR = new char[2][20];

    private static String[] words = new String[0];

    public static void main(String[] args) {

        if (args.length != 2) {
            System.err.println("You need to define a method and a length");
            System.exit(1);
        }

        int length = 0;
        try {
            length = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.err.println("Could not convert " + args[1] + " to an Integer");
            System.exit(1);
        }

        String password = "";

        if (args[0].equalsIgnoreCase("random")) {

            password = random(length);
        } else if (args[0].equalsIgnoreCase("left-right")) {

            password = leftRight(length);
        } else if (args[0].equalsIgnoreCase("words")) {

            password = words(length);
        }

        System.out.println(password);
    }

    private static String random(int length) {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int character = (int) (Math.random() * cCharacters.length);
            password.append(cCharacters[character]);
        }
        return password.toString();
    }

    private static String leftRight(int length) {
        StringBuilder password = new StringBuilder();
        cCharactersLR[LEFT] = sCharactersLR[LEFT].toCharArray();
        cCharactersLR[RIGHT] = sCharactersLR[RIGHT].toCharArray();

        for (int i = 0; i < length; i++) {
            char[] z = cCharactersLR[i % 2];
            int character = (int) (Math.random() * z.length);
            password.append(z[character]);
        }
        return password.toString();
    }

    private static String words(int length) {
        StringBuilder password = new StringBuilder();
        String woerterStr = FileLoader.load("media/woerter.txt");
        String[] words = woerterStr.split("\n");

        int number = (int) (Math.random() * 100);
        System.out.println(number);
        password.append(number);

        for (int i = 0; i < length; i++) {
            int word = (int) (Math.random() * words.length);
            System.out.println(words[word]);
            password.append(words[word]);
        }

        return password.toString();
    }
}