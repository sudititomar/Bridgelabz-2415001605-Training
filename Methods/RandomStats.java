package java_method;
import java.util.Arrays;

public class RandomStats {
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + (int)(Math.random() * 9000);
        }
        return arr;
    }
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            sum += num;
        }

        double average = (double) sum / numbers.length;
        return new double[] {average, min, max};
    }

    public static void main(String[] args) {
        int[] randomNumbers = generate4DigitRandomArray(5);

        System.out.println("Generated numbers: " + Arrays.toString(randomNumbers));

        double[] stats = findAverageMinMax(randomNumbers);

        System.out.printf("Average: %.2f\n", stats[0]);
        System.out.println("Minimum: " + (int)stats[1]);
        System.out.println("Maximum: " + (int)stats[2]);
    }
}
