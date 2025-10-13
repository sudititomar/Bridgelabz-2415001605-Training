import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // Count digits
        int temp = number;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        
        int[] digits = new int[count];
        int[] reversed = new int[count];

        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        for (int i = 0; i < count; i++) {
            reversed[i] = digits[count - 1 - i];
        }

        for (int i = 0; i < count; i++) {
            System.out.print(reversed[i]);
        }
        System.out.println();

    }
}
