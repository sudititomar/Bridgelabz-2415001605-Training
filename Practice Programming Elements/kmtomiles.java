import java.util.Scanner;

public class kmtomiles {
    public static void main(String[] args) {
        double km;
        Scanner input = new Scanner(System.in);
        km = input.nextInt();
        double miles = km / 1.6;
        System.out.printf("The total miles is %.2f mile for the given %.2f km%n", miles, km);
    }
}
