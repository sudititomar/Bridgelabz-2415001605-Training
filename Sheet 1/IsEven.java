import java.util.Scanner;
public class IsEven {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println(num + " is even? " + isEven(num));
    }
}
