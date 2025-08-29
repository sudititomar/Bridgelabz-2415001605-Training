import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a positive integer.");
            sc.close();
            return;
        }
        int num = sc.nextInt();
        if (num <= 0) {
            sc.close();
            return;
        }


        String[] results = new String[num + 1];

        for (int i = 0; i <= num; i++) {
            if (i == 0) {
                results[i] = "0";
            } else if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = Integer.toString(i);
            }
        }

        for (int i = 1; i <= num; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

    }
}
