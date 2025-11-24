import java.util.Scanner;
public class DigitSumOpt {
    public static int digitSumOpt(int n, boolean sumEven) {
        n = Math.abs(n);
        int sum = 0;
        do {
            int d = n % 10;
            if(sumEven && d % 2 == 0) sum += d;
            if(!sumEven && d % 2 != 0) sum += d;
            n /= 10;
        } while(n > 0);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print("Sum even digits (true/false)? ");
        boolean sumEven = sc.nextBoolean();
        System.out.println("Sum: " + digitSumOpt(n, sumEven));
    }
}
