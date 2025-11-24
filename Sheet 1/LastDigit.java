import java.util.Scanner;
public class LastDigit {
    public static int lastDigit(int n) {
        return Math.abs(n % 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println("Last digit of " + num + ": " + lastDigit(num));
    }
}
