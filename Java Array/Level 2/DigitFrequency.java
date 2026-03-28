import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();

        int count = 0;
        long temp = number;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        int[] digits = new int[count];
        int[] frequency = new int[10];

        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = (int)(temp % 10);
            temp /= 10;
        }

        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " " + frequency[i]);
            }
        }

    }
}
