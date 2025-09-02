import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division;
        if (number2 != 0) {
            division = number1 / number2;
        } else {
            System.out.println("Division by zero is not allowed.");
            return;
        }

        System.out.printf("The addition, subtraction, multiplication and division values of %.2f and %.2f are %.2f, %.2f, %.2f, and %.2f%n",
                number1, number2, addition, subtraction, multiplication, division);
    }
}
