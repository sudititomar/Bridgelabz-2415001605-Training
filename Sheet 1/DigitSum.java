import java.util.Scanner;
public class DigitSum {
    public static int digitSum(int n) {
        n = Math.abs(n);
        int sum = 0;
        do { sum += n % 10; n /= 10; } while(n > 0);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Sum of digits: " + digitSum(n));
    }
}
