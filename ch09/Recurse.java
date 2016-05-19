import java.util.Scanner;

/**
 * Recursion exercise.
 */
public class Recurse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a word (all lowercase, no spaces): ");
        String s = in.nextLine();
        System.out.println(isPalindrome(s));    
    }

    /**
     * Returns the first character of the given String.
     */
    public static char first(String s) {
        return s.charAt(0);
    }

    /**
     * Returns all but the first letter of the given String.
     */
    public static String rest(String s) {
        return s.substring(1);
    }

    /**
     * Returns all but the first and last letter of the String.
     */
    public static String middle(String s) {
        return s.substring(1, s.length() - 1);
    }

    /**
     * Returns the length of the given String.
     */
    public static int length(String s) {
        return s.length();
    }

    public static void printString(String s) {
        int len = length(s);
        for (int i = 0; i < len; i++) {
            System.out.println(first(s));
            s = rest(s);
        }
    }

    public static String reverseString(String s) {
        String reverse = "";
        int len = length(s);

        for (int i = 0; i < len; i++) {
            reverse = first(s) + reverse;
            s = rest(s);
        }

        return reverse;
    }

    public static boolean isPalindrome(String s) {
        if (length(s) == 1) {
            return true;
        }

        else if (length(s) == 2 && first(s) == first(reverseString(s))) {
            return true;
        }

        else {
            if (first(s) == first(reverseString(s))) {
                return isPalindrome(middle(s));
            }

            else {
                return false;
            }
        }
    }

}
