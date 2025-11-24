public class WrapperDemo4 {
    public static void main(String[] args) {
        Integer a = 100, b = 100, c = 200, d = 200;
        System.out.println(a == b); // true (cached)
        System.out.println(c == d); // false (not cached)
        System.out.println(a.equals(b)); // true
        // == compares reference, equals checks actual value. Integers -128 to 127 are cached, so '==' is true for a/b.
    }
}
