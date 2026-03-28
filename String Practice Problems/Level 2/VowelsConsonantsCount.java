import java.util.Scanner;

public class VowelsConsonantsCount {

    public static String checkChar(char ch) {
        // Convert uppercase to lowercase
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if letter
        if (ch < 'a' || ch > 'z') {
            return "Not a Letter";
        }

        // Check for vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }

        // Otherwise consonant
        return "Consonant";
    }

    public static int[] countVowelsConsonants(String str) {
        int vowels = 0, consonants = 0;
        int length = str.length();

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            String result = checkChar(ch);
            if ("Vowel".equals(result)) {
                vowels++;
            } else if ("Consonant".equals(result)) {
                consonants++;
            }
        }
        return new int[] {vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int[] counts = countVowelsConsonants(input);
        System.out.println("Number of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);

        
    }
}
