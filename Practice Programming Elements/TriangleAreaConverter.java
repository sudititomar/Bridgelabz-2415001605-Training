import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        double base = input.nextDouble();
        double height = input.nextDouble();
        double areaInches = 0.5 * base * height;
        double areaCm = areaInches * 2.54 * 2.54;

        System.out.printf("The area of the triangle is %.2f square inches and %.2f square centimeters.%n", areaInches, areaCm);
    }
}
