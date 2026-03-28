import java.util.Scanner;

public class Smallestcheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] numbers = new int[3];
        numbers[0] = sc.nextInt();
        numbers[1] = sc.nextInt();
        numbers[2] = sc.nextInt();


        int min = numbers[0];


        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        boolean isSmallest = (numbers[0] == min);

        System.out.println("Is the first number the smallest? " + isSmallest);

    }
}
