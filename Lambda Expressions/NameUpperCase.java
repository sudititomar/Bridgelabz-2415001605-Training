import java.util.*;

public class NameUppercase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Carol");
        names.stream().map(String::toUpperCase).forEach(System.out::println); // ALL CAPS
    }
}
