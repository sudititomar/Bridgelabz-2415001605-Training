import java.util.Scanner;

public class CharacterFrequency {

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

    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];
        int length = findLength(text);

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) uniqueCount++;
        }

        String[][] freqArr = new String[uniqueCount][2];
        int idx = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                freqArr[idx][0] = Character.toString((char)i);
                freqArr[idx][1] = Integer.toString(freq[i]);
                idx++;
            }
        }
        return freqArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[][] freq = findFrequency(input);

        System.out.println("Character\tFrequency");
        for (String[] pair : freq) {
            System.out.println(pair[0] + "\t\t" + pair[1]);
        }

    }
}
