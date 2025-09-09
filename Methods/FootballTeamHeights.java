package java_method;
import java.util.Arrays;

public class FootballTeamHeights {

    public static int[] generateRandomHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + (int)(Math.random() * 101); 
        }
        return heights;
    }

    public static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    public static double findMean(int[] heights) {
        return (double)findSum(heights) / heights.length;
    }

    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }

    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateRandomHeights(11);

        System.out.println("Player Heights (cm): " + Arrays.toString(heights));
        System.out.println("Shortest height: " + findShortest(heights) + " cm");
        System.out.println("Tallest height: " + findTallest(heights) + " cm");
        System.out.printf("Mean height: %.2f cm\n", findMean(heights));
    }
}

