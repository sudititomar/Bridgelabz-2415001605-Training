package java_method;
	import java.util.Random;

	public class zaraBonusCalculator {

	    public static double[][] generateEmployeeData(int numberOfEmployees) {
	        double[][] data = new double[numberOfEmployees][2]; // [salary, yearsOfService]
	        Random rand = new Random();

	        for (int i = 0; i < numberOfEmployees; i++) {
	            int salary = rand.nextInt(50000) + 50000; // 5-digit salary: 50000 to 99999
	            int yearsOfService = rand.nextInt(11);     // 0 to 10 years
	            data[i][0] = salary;
	            data[i][1] = yearsOfService;
	        }

	        return data;
	    }

	    public static double[][] calculateBonusAndNewSalary(double[][] employeeData) {
	        int n = employeeData.length;
	        double[][] result = new double[n][3]; // [oldSalary, bonus, newSalary]

	        for (int i = 0; i < n; i++) {
	            double oldSalary = employeeData[i][0];
	            double years = employeeData[i][1];
	            double bonus = (years > 5) ? oldSalary * 0.05 : oldSalary * 0.02;
	            double newSalary = oldSalary + bonus;

	            result[i][0] = oldSalary;
	            result[i][1] = bonus;
	            result[i][2] = newSalary;
	        }

	        return result;
	    }

	    public static void displayReport(double[][] employeeData, double[][] salaryData) {
	        double totalOldSalary = 0;
	        double totalBonus = 0;
	        double totalNewSalary = 0;

	        System.out.printf("%-5s %-10s %-10s %-10s %-10s %-12s%n", 
	                          "ID", "OldSalary", "Years", "Bonus", "NewSalary", "BonusRate");
	        System.out.println("--------------------------------------------------------------");

	        for (int i = 0; i < employeeData.length; i++) {
	            double oldSalary = salaryData[i][0];
	            double bonus = salaryData[i][1];
	            double newSalary = salaryData[i][2];
	            double years = employeeData[i][1];
	            String rate = years > 5 ? "5%" : "2%";

	            System.out.printf("%-5d %-10.2f %-10.0f %-10.2f %-10.2f %-12s%n", 
	                              i + 1, oldSalary, years, bonus, newSalary, rate);

	            totalOldSalary += oldSalary;
	            totalBonus += bonus;
	            totalNewSalary += newSalary;
	        }

	        System.out.println("--------------------------------------------------------------");
	        System.out.printf("TOTAL %-10.2f %-10s %-10.2f %-10.2f%n", 
	                          totalOldSalary, "", totalBonus, totalNewSalary);
	    }

	    public static void main(String[] args) {
	        int numberOfEmployees = 10;

	        double[][] employeeData = generateEmployeeData(numberOfEmployees);
	        double[][] salaryAndBonus = calculateBonusAndNewSalary(employeeData);
	        displayReport(employeeData, salaryAndBonus);
	    }
	}
