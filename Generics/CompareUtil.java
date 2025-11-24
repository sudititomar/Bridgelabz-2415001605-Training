public class CompareUtil {
    public static <T> boolean isEqual(T a, T b) {
        return a.equals(b);
    }

    public static void main(String[] args) {
        System.out.println(isEqual(10, 10));           // true
        System.out.println(isEqual("abc", "abC"));     // false
        System.out.println(isEqual(3.5, 3.5));         // true
    }
}
