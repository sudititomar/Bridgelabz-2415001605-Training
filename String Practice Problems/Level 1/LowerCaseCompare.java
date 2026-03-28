import java.util.Scanner;

public class LowerCaseCompare {

    public static String toLowercaseUsingCharAt(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
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

        String lowercaseCustom = toLowercaseUsingCharAt(input);
        String lowercaseBuiltIn = input.toLowerCase();

        boolean isEqual = compareStrings(lowercaseCustom, lowercaseBuiltIn);

        System.out.println("Lowercase using charAt(): " + lowercaseCustom);
        System.out.println("Lowercase using toLowerCase(): " + lowercaseBuiltIn);
        System.out.println("Are both lowercase conversions equal? " + isEqual);

     
    }
}

