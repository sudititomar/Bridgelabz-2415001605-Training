import java.util.Scanner;

public class SubStringCompare {

    public static String substringUsingCharAt(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        
        int start = sc.nextInt();

        int end = sc.nextInt();

        String subCharAt = substringUsingCharAt(input, start, end);
        String subBuiltIn = input.substring(start, end);

        boolean isEqual = compareStrings(subCharAt, subBuiltIn);

        System.out.println("Substring using charAt(): " + subCharAt);
        System.out.println("Substring using substring(): " + subBuiltIn);
        System.out.println("Are both substrings equal? " + isEqual);

        
    }
}
