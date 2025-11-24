import java.util.Scanner;
public class NthFibonnaci {
    public static int nthFibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int a = 0, b = 1;
        for(int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b; b = temp;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.println(n + "th Fibonacci number: " + nthFibonacci(n));
    }
}
