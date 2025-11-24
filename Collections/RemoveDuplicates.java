import java.util.*;

public class RemoveDuplicates{
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(3, 1, 2, 2, 3, 4);
        List<Integer> result = new ArrayList<>(new LinkedHashSet<>(input));
        System.out.println("Without duplicates: " + result);
    }
}
