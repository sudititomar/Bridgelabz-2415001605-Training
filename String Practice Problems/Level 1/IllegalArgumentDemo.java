import java.util.Scanner;

public class IllegalArgumentDemo {

    public static void generateException(String str) {
        System.out.println(str.substring(5, 2)); // start index > end index
    }

    public static void handleException(String str) {
        try {
            System.out.println(str.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException");
        }
    }

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        String input = sca.next();

        generateException(input);
        handleException(input);
    }
}
