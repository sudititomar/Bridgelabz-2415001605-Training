import java.util.Scanner;

public class VowelsConsonantsCharacterType {

    public static String checkChar(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }
        if (ch < 'a' || ch > 'z') {
            return "Not a Letter";
        }
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }
        return "Consonant";
    }

    public static String[][] charTypes(String str) {
        int length = str.length();

        String[][] result = new String[length][2];
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkChar(ch);
        }
        return result;
    }

    public static void displayTable(String[][] arr) {
        System.out.println("Character\tType");
        for (String[] row : arr) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[][] charTypesResult = charTypes(input);
        displayTable(charTypesResult);

    }
}
