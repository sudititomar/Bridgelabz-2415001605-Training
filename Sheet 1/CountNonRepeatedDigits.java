import java.util.Scanner;
public class CountNonRepeatedDigits {
    public static int countNonRepeatedDigits(int n) {
        n = Math.abs(n);
        int[] freq = new int[10];
        int temp = n;
        if(temp == 0) freq[0]++;
        while(temp > 0) { freq[temp % 10]++; temp /= 10; }
        int count = 0;
        for(int f : freq) if(f == 1) count++;
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Non-repeated digits: " + countNonRepeatedDigits(n));
    }
}
