import java.util.Scanner;
public class SecondLastDigit {
    public static int secondLastDigit(int n) {
        return Math.abs((Math.abs(n) / 10) % 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println("Second last digit of " + num + ": " + secondLastDigit(num));
    }
}
