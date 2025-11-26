//Section A (Elementary coding practices)
import java.util.Scanner;
public class CountDigits {
    public static int countDigits(int n) {
        n = Math.abs(n);
        int cnt = (n == 0) ? 1 : 0;
        while(n > 0) {
            cnt++; n /= 10;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Number of digits: " + countDigits(n));
    }
}

