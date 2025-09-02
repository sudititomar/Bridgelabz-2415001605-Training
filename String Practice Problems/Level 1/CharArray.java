import java.util.Scanner;

public class CharArray{

    public static char[] getChars(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        String input = sca.next();

        char[] customChars = getChars(input);
        char[] builtInChars = input.toCharArray();

        boolean result = compareCharArrays(customChars, builtInChars);

        System.out.println("Characters from custom method:");
        for (char c : customChars) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Characters from toCharArray():");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Are both character arrays equal? " + result);


    }
}

