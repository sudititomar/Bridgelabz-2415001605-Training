import java.util.Scanner;
public class CountUniqueDigits {
    public static int countUniqueDigits(int n) {
        n = Math.abs(n);
        boolean[] seen = new boolean[10];
        int count = 0;
        if(n == 0) return 1;
        while(n > 0) {
            int d = n % 10;
            if(!seen[d]) { seen[d] = true; count++; }
            n /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Unique digits: " + countUniqueDigits(n));
    }
}
