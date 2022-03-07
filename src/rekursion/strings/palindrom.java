package rekursion.strings;

// If at first you don't succeed....
// try, try again

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class palindrom {
    public static boolean isPalindrome(String s) {
        // Trivialfall
        if (s.length() < 2) {
            return true;
        } else { // Rekursiver Fall
            char erstes = s.charAt(0);
            char letztes = s.charAt(s.length() - 1);
            String zwischen = s.substring(1, s.length() - 1);
            return (erstes == letztes) && isPalindrome(zwischen);
        }
    }
    // "h", "elp"
    private static void _permutationen(String fertig, String rest) {
        if (rest.length() == 0) {
            System.out.println(fertig);
        } else {
            for (int i = 0; i < rest.length(); i++) {
                char zeichen = rest.charAt(i);
                String neuerRest = rest.substring(0, i) + rest.substring(i+1);
                _permutationen(fertig + zeichen, neuerRest);
            }
        }
    }

    // Starter-Methode
    public static void permutationen(String wort) {
        _permutationen("", wort);
    }

    // lagerregal = lagerregal
    // hannah
    // madamimadam
    // einnegermitgazellezagtimregennie
    public static void main(String[] args) {
        // System.out.println(isPalindrome("hallo")); //=> false
        // System.out.println(isPalindrome("anna")); //=> true
        // System.out.println(isPalindrome("ana")); //=> true
        // System.out.println(isPalindrome("abc")); //=> false
        // System.out.println(isPalindrome("lagerregal")); //=> true
        permutationen("isabel"); // abc, acb,
    }
}

// astronomer
// moonstarer
// Scrabble => SOWPODS dictionary