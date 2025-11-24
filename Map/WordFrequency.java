import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String text = "Hello world, hello Java!";
        text = text.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase();
        String[] words = text.split("\\s+");
        Map<String, Integer> freq = new HashMap<>();
        for(String word : words)
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        System.out.println(freq); // {hello=2, world=1, java=1}
    }
}
