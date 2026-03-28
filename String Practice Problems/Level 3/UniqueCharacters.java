import java.util.Scanner;

public class UniqueCharacters {

    public static int findLength(String str) {
        int length = 0;
        try {
            while (true) {
                @SuppressWarnings("unused")
                char ch = str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {}
        return length;
    }

    public static char[] findUniqueChars(String text) {
        int length = findLength(text);
        char[] temp = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temp[uniqueCount++] = current;
            }
        }

        char[] uniqueChars = new char[uniqueCount];
        System.arraycopy(temp, 0, uniqueChars, 0, uniqueCount);
        return uniqueChars;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        char[] uniqueChars = findUniqueChars(input);

        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        System.out.println();
    
    }
}
