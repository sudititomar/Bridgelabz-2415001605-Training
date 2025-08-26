import java.util.Scanner;

public class Largestcheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();

        int number2 = sc.nextInt();

        int number3 = sc.nextInt();


        int max = number1;
        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }
        
    }
}
