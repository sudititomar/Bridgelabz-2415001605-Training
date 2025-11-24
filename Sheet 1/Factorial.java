import java.util.Scanner;
public class Factorial {
    public static long factorial(int n) {
        long res = 1;
        for(int i = 2; i <= n; i++) res *= i;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + ": " + factorial(n));
    }
}
