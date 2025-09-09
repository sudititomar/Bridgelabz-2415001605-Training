package java_method;
import java.util.Scanner;

public class TriangularParkRun {
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distanceToRun = 5000.0; 
        return distanceToRun / perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of side 1 (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter length of side 2 (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter length of side 3 (in meters): ");
        double side3 = scanner.nextDouble();
        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
            double rounds = calculateRounds(side1, side2, side3);
            System.out.printf("The athlete needs to complete %.2f rounds to run 5 km.%n", rounds);
        } else {
            System.out.println("The entered sides do not form a valid triangle.");
        }
    }
}

