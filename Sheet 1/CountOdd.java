import java.util.Scanner;
public class CountOdd {
    public static int countOdd(int[] nums) {
        int count = 0;
        for (int n : nums) {
            if (n % 2 != 0) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        System.out.println("Enter 5 numbers:");
        for(int i=0; i<5; i++) nums[i] = sc.nextInt();
        System.out.println("Number of odd numbers: " + countOdd(nums));
    }
}
