import java.util.Scanner;

public class FrequencyUsingUniqueChars {

    public static int findLength(String str) {
        int length = 0;
        try {
            while (true) {
                @SuppressWarnings("unused")
                char c = str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {}
        return length;
    }

    public static char[] uniqueCharacters(String text) {
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

    public static String[][] findFrequencyUsingUniqueChars(String text) {
        int[] freq = new int[256];
        int length = findLength(text);

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        char[] uniqueChars = uniqueCharacters(text);

        String[][] freqArr = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            freqArr[i][0] = Character.toString(uniqueChars[i]);
            freqArr[i][1] = Integer.toString(freq[uniqueChars[i]]);
        }
        return freqArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[][] freq = findFrequencyUsingUniqueChars(input);

        System.out.println("Character\tFrequency");
        for (String[] pair : freq) {
            System.out.println(pair[0] + "\t\t" + pair[1]);
        }
       
    }
}
