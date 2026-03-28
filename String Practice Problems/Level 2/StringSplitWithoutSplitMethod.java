import java.util.Scanner;

public class StringSplitWithoutSplitMethod {

    public static int findLength(String str) {
        if (str == null) {
            return -1;
        }
        int count = 0;
        try {
            while (true) {
                // Just accessing the character to check bounds; value not needed
                @SuppressWarnings("unused")
                char c = str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] splitWords(String text) {
        int length = findLength(text);
        if (length <= 0) {
            return new String[0];
        }

        // Count words by counting spaces + 1
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndexes = new int[wordCount + 1];
        spaceIndexes[0] = -1; // before first char
        int index = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index] = i;
                index++;
            }
        }
        spaceIndexes[wordCount] = length; // after last char

        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            int start = spaceIndexes[i] + 1;
            int end = spaceIndexes[i + 1];
            String word = "";
            for (int j = start; j < end; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
        }
        return words;
    }

    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] userSplit = splitWords(text);
        String[] builtinSplit = text.split(" ");

        System.out.println("Split without split() method:");
        for (String w : userSplit) {
            System.out.println(w);
        }

        System.out.println("\nSplit with split() method:");
        for (String w : builtinSplit) {
            System.out.println(w);
        }

        System.out.println("\nArrays are equal: " + compareStringArrays(userSplit, builtinSplit));
     
    }
}
