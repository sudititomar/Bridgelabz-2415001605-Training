import java.util.Scanner;
public class DigitSumEven {
    public static int digitSumEven(int n) {
        n = Math.abs(n);
        int sum = 0;
        do {
            int d = n % 10;
            if(d % 2 == 0) sum += d;
            n /= 10;
        } while(n > 0);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Sum of even digits: " + digitSumEven(n));
    }
}
