import java.util.Scanner;

public class FrequencyWithNestedLoops {

    public static String[][] frequencyOfChars(String text) {
        char[] chars = text.toCharArray();
        int length = chars.length;
        int[] freq = new int[length];

        for (int i = 0; i < length; i++) {
            freq[i] = 1;
        }

        for (int i = 0; i < length; i++) {
            if (chars[i] == '0') continue;
            for (int j = i + 1; j < length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark duplicate
                }
            }
        }

        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') uniqueCount++;
        }

        String[][] freqArr = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') {
                freqArr[index][0] = Character.toString(chars[i]);
                freqArr[index][1] = Integer.toString(freq[i]);
                index++;
            }
        }
        return freqArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[][] freq = frequencyOfChars(input);

        System.out.println("Character\tFrequency");
        for (String[] pair : freq) {
            System.out.println(pair[0] + "\t\t" + pair[1]);
        }
        
    }
}
