import java.util.Scanner;
public class IsOdd {
    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println(num + " is odd? " + isOdd(num));
    }
}
