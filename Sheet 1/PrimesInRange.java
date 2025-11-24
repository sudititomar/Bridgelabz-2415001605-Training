import java.util.Scanner;
public class PrimesInRange {
    public static boolean isPrime(int n) {
        if(n < 2) return false;
        for(int i = 2; i * i <= n; i++)
            if(n % i == 0) return false;
        return true;
    }
    public static int primesInRange(int start, int end) {
        int cnt = 0;
        for(int i = start; i <= end; i++)
            if(isPrime(i)) cnt++;
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range start: ");
        int start = sc.nextInt();
        System.out.print("Enter range end: ");
        int end = sc.nextInt();
        System.out.println("Number of primes: " + primesInRange(start, end));
    }
}
