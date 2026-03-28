import java.util.Scanner;

public class NumberFormatExceptionDemo {

    public static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number);
    }

    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException");
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
