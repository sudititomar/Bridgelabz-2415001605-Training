import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double heightCm = input.nextDouble();
        double inchesTotal = heightCm / 2.54;
        int feet = (int) (inchesTotal / 12);
        double inches = inchesTotal % 12;

        System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f%n", heightCm, feet, inches);
    }
}
