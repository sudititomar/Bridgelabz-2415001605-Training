import java.util.Scanner;

public class YoungestTallestFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

    
        for (int i = 0; i < friends.length; i++) {
   
            ages[i] = sc.nextInt();

            heights[i] = sc.nextDouble();
        }

        int minAgeIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minAgeIndex]) {
                minAgeIndex = i;
            }
        }


        int maxHeightIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }

        System.out.println("The youngest friend is " + friends[minAgeIndex] + " with age " + ages[minAgeIndex]);
        System.out.println("The tallest friend is " + friends[maxHeightIndex] + " with height " + heights[maxHeightIndex] + " cm");

    }
}
