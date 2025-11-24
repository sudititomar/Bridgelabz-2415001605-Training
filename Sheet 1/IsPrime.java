import java.util.Scanner;
public class IsPrime {
    public static boolean isPrime(int n) {
        if(n < 2) return false;
        for(int i = 2; i * i <= n; i++)
            if(n % i == 0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println(n + " is prime? " + isPrime(n));
    }
}
