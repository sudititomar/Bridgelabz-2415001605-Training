import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            if (!sc.hasNextDouble()) {
                sc.next();
                i--;
                continue;
            }
            double s = sc.nextDouble();
            if (s <= 0) {
                i--;
                continue;
            }

            if (!sc.hasNextDouble()) {
                sc.next();
                i--;
                continue;
            }
            double y = sc.nextDouble();
            if (y < 0) {
                i--;
                continue;
            }

            salary[i] = s;
            yearsOfService[i] = y;
        }

        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total old salary: " + totalOldSalary);
        System.out.println("Total new salary: " + totalNewSalary);

    }
}
