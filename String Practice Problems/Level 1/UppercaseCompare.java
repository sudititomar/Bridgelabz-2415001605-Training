import java.util.Scanner;

public class UppercaseCompare {

    public static String toUppercaseUsingCharAt(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }
            result += ch;
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
        Scanner sca = new Scanner(System.in);

        String input = sca.nextLine();

        String uppercaseCustom = toUppercaseUsingCharAt(input);
        String uppercaseBuiltIn = input.toUpperCase();

        boolean isEqual = compareStrings(uppercaseCustom, uppercaseBuiltIn);

        System.out.println("Uppercase using charAt(): " + uppercaseCustom);
        System.out.println("Uppercase using toUpperCase(): " + uppercaseBuiltIn);
        System.out.println("Are both uppercase conversions equal? " + isEqual);


    }
}
