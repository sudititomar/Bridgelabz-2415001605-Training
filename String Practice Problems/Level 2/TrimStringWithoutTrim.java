import java.util.Scanner;

public class TrimStringWithoutTrim {

    public static int[] findTrimIndexes(String str) {
        int length = 0;
        try {
            while (true) {
                @SuppressWarnings("unused")
                char ch = str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {}

        int start = 0;
        while (start < length && str.charAt(start) == ' ') {
            start++;
        }
        int end = length - 1;
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }

    public static String substring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        int len1 = 0, len2 = 0;
        try {
            while (true) {
                @SuppressWarnings("unused")
                char ch = s1.charAt(len1);
                len1++;
            }
        } catch (IndexOutOfBoundsException e) {}
        try {
            while (true) {
                @SuppressWarnings("unused")
                char ch = s2.charAt(len2);
                len2++;
            }
        } catch (IndexOutOfBoundsException e) {}

        if (len1 != len2) {
            return false;
        }
        for (int i = 0; i < len1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int[] indexes = findTrimIndexes(input);
        String trimmedManual = "";
        if (indexes[0] <= indexes[1]) {
            trimmedManual = substring(input, indexes[0], indexes[1]);
        }

        String trimmedBuiltIn = input.trim();

        System.out.println("Trimmed without trim(): \"" + trimmedManual + "\"");
        System.out.println("Trimmed with trim():    \"" + trimmedBuiltIn + "\"");

        System.out.println("Are both trimmed strings equal? " + compareStrings(trimmedManual, trimmedBuiltIn));

     
    }
}
