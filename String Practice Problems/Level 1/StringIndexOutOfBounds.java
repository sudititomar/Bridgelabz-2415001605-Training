import java.util.Scanner;

public class StringIndexOutOfBounds {

    public static void generateException(String str) {
        System.out.println(str.charAt(str.length())); // Out of bounds
    }

    public static void handleException(String str) {
        try {
            System.out.println(str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String input = sca.next();

        generateException(input);
        handleException(input);
    }
}
