import java.util.Scanner;

public class FeeDiscountCalculator {
    public static void main(String[] args) {
        double fee, discountPercent, discount, finalFee;
        Scanner input = new Scanner(System.in);

        fee = input.nextDouble();

        discountPercent = input.nextDouble();

        discount = fee * discountPercent / 100;
        finalFee = fee - discount;

        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f%n", discount, finalFee);
    }
}
