import java.util.*;

public class ElementFrequency {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange");
        Map<String, Integer> freq = new HashMap<>();
        for (String w : words)
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        System.out.println("Frequency Map: " + freq);
    }
}
