import java.util.*;

public class NthFromEnd {
    public static String nthFromEnd(LinkedList<String> ll, int N) {
        Iterator<String> ahead = ll.iterator(), behind = ll.iterator();
        for(int i = 0; i < N; i++) ahead.next();
        while (ahead.hasNext()) { ahead.next(); behind.next(); }
        return behind.next();
    }

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int N = 2;
        System.out.println(N + "th from end: " + nthFromEnd(ll, N)); // D
    }
}
