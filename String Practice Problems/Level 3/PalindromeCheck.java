import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Iterative check with start & end
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive check
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Using char arrays and reverse
    public static char[] reverseString(String text) {
        int length = text.length();
        char[] reversed = new char[length];
        for (int i = 0; i < length; i++) {
            reversed[i] = text.charAt(length - 1 - i);
        }
        return reversed;
    }

    public static boolean isPalindromeCharArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);
        if (original.length != reversed.length) return false;
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        boolean resIter = isPalindromeIterative(input);
        boolean resRec = isPalindromeRecursive(input, 0, input.length() - 1);
        boolean resCharArr = isPalindromeCharArray(input);

        System.out.println("Palindrome by iterative check: " + resIter);
        System.out.println("Palindrome by recursive check: " + resRec);
        System.out.println("Palindrome by char array check: " + resCharArr);

    
    }
}
