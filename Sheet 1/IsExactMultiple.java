import java.util.Scanner;
public class IsExactMultiple {
    public static boolean isExactMultiple(int n, int m) {
        return m != 0 && n % m == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for n: ");
        int n = sc.nextInt();
        System.out.print("Enter value for m: ");
        int m = sc.nextInt();
        System.out.println(n + " is exact multiple of " + m + "? " + isExactMultiple(n, m));
    }
}
