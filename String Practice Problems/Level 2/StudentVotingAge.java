import java.util.Scanner;
import java.util.Random;

public class StudentVotingAge {

    public static int[] generateRandomAges(int n) {
        int[] ages = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10; // 10 to 99 age
        }
        return ages;
    }

    public static String[][] checkVoting(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }

    public static void displayTable(String[][] arr) {
        System.out.println("Age\tCan Vote");
        for (String[] row : arr) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[] ages = new int[n];
        System.out.println("Enter the ages of " + n + " students:");
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }

        // If random ages are needed instead of user input, uncomment below
        // ages = generateRandomAges(n);

        String[][] result = checkVoting(ages);
        displayTable(result);
        
    }
}
