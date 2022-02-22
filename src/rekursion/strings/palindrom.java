package rekursion.strings;

public class palindrom {
    public static boolean isPalindrome(String s) {
        // Trivialfall
        if (s.length() < 2) {
            return true;
        } else { // Rekursiver Fall
            char erstes = s.charAt(0);
            char letztes = s.charAt(s.length()-1);
            String zwischen = s.substring(1, s.length() - 1);
            return (erstes == letztes) && isPalindrome(zwischen);
        }
    }

    private static void _permutationen(String finiss, String remainder) {
        if (remainder.length() == 0) {
            System.out.println(finiss);
        } else {
            for (int i = 0; i < remainder.length(); i++) {
                char current = remainder.charAt(i);
                String newRemainder = remainder.substring(0, i) + remainder.substring(i+1, remainder.length());
                _permutationen(finiss + current, newRemainder);
            }
        }
    }

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
        permutationen("help");
    }
}
