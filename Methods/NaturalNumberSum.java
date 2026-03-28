package java_method;
	import java.util.Scanner;

	public class NaturalNumberSum {

	    public static int sumRecursive(int n) {
	        if (n == 1) {
	            return 1;
	        }
	        return n + sumRecursive(n - 1);
	    }

	    public static int sumFormula(int n) {
	        return n * (n + 1) / 2;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a natural number: ");
	        int n = scanner.nextInt();

	        if (n <= 0) {
	            System.out.println("Invalid input. Please enter a natural number greater than 0.");
	        } else {
	            int sumRec = sumRecursive(n);
	            int sumFor = sumFormula(n);

	            System.out.println("Sum using recursion: " + sumRec);
	            System.out.println("Sum using formula: " + sumFor);

	            if (sumRec == sumFor) {
	                System.out.println("Both results are equal. Computation is correct.");
	            } else {
	                System.out.println("Mismatch in results. Check the logic.");
	            }
	        }
	}

}
