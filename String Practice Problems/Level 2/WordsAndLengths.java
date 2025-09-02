import java.util.Scanner;

public class WordsAndLengths {

    public static int findLength(String str) {
        if (str == null) {
            return 0;
        }
        int count = 0;
        try {
            while (true) {
                // Accessing character to check bounds; value is intentionally unused
                @SuppressWarnings("unused")
                char unused = str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] splitWords(String text) {
        int length = findLength(text);
        if (length == 0) {
            return new String[0];
        }

        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndexes = new int[wordCount + 1];
        spaceIndexes[0] = -1;
        int index = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index] = i;
                index++;
            }
        }
        spaceIndexes[wordCount] = length;

        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            String word = "";
            for (int j = spaceIndexes[i] + 1; j < spaceIndexes[i + 1]; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
        }
        return words;
    }

    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            int length = findLength(words[i]);
            result[i][1] = String.valueOf(length);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] wordsAndLens = wordsWithLengths(words);

        System.out.println("Word\tLength");
        for (String[] pair : wordsAndLens) {
            String word = pair[0];
            int len = Integer.parseInt(pair[1]);
            System.out.println(word + "\t" + len);
        }
        
    }
}

