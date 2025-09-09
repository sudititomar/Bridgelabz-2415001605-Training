package java_method;
	import java.util.Scanner;

	public class DistanceAndLineEquation {

	    public static double calculateDistance(double x1, double y1, double x2, double y2) {
	        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	    }

	    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
	        double[] result = new double[2];

	        if (x2 == x1) {
	            throw new ArithmeticException("Slope is undefined for vertical line (x2 == x1).");
	        }

	        double slope = (y2 - y1) / (x2 - x1);
	        double intercept = y1 - slope * x1;

	        result[0] = slope;
	        result[1] = intercept;

	        return result;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input two points
	        System.out.print("Enter x1: ");
	        double x1 = sc.nextDouble();
	        System.out.print("Enter y1: ");
	        double y1 = sc.nextDouble();
	        System.out.print("Enter x2: ");
	        double x2 = sc.nextDouble();
	        System.out.print("Enter y2: ");
	        double y2 = sc.nextDouble();

	        double distance = calculateDistance(x1, y1, x2, y2);
	        System.out.printf("Euclidean Distance between points: %.2f\n", distance);

	        try {
	            double[] line = findLineEquation(x1, y1, x2, y2);
	            double slope = line[0];
	            double intercept = line[1];
	            System.out.printf("Equation of line: y = %.2fx + %.2f\n", slope, intercept);
	        } catch (ArithmeticException e) {
	            System.out.println(e.getMessage());
	        }

	}

}
