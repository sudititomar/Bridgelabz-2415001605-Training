import java.util.Scanner;
public class NthPrime {
    public static boolean isPrime(int n) {
        if(n < 2) return false;
        for(int i = 2; i * i <= n; i++)
            if(n % i == 0) return false;
        return true;
    }
    public static int nthPrime(int n) {
        int count = 0, num = 2;
        while(true) {
            if(isPrime(num)) count++;
            if(count == n) return num;
            num++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.println(n + "th prime: " + nthPrime(n));
    }
}
