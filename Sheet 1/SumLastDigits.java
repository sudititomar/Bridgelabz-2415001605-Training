import java.util.Scanner;
public class SumLastDigits {
    public static int sumLastDigits(int a, int b) {
        int lastA = Math.abs(a % 10);
        int lastB = Math.abs(b % 10);
        return lastA + lastB;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();
        System.out.println("Sum of last digits: " + sumLastDigits(a, b));
    }
}
