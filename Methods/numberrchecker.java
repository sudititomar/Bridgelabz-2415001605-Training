package java_method;

public class numberrchecker {
	public class NumberChecker {

	    public static int sumOfProperDivisors(int number) {
	        int sum = 1;
	        for (int i = 2; i <= number / 2; i++) {
	            if (number % i == 0) sum += i;
	        }
	        return number > 1 ? sum : 0;
	    }

	    public static boolean isPerfect(int number) {
	        return sumOfProperDivisors(number) == number && number > 0;
	    }

	    public static boolean isAbundant(int number) {
	        return sumOfProperDivisors(number) > number;
	    }

	    public static boolean isDeficient(int number) {
	        return sumOfProperDivisors(number) < number;
	    }

	    public static int factorial(int n) {
	        int fact = 1;
	        for (int i = 2; i <= n; i++) fact *= i;
	        return fact;
	    }

	    public static boolean isStrong(int number) {
	        int sum = 0;
	        int n = number;
	        while (n > 0) {
	            int digit = n % 10;
	            sum += factorial(digit);
	            n /= 10;
	        }
	        return sum == number;
	    }

	    public static void main(String[] args) {
	        int[] numbers = {6, 12, 15, 145, 28};

	        for (int num : numbers) {
	            System.out.println("Number: " + num);
	            System.out.println("Perfect? " + isPerfect(num));
	            System.out.println("Abundant? " + isAbundant(num));
	            System.out.println("Deficient? " + isDeficient(num));
	            System.out.println("Strong? " + isStrong(num));
	            System.out.println();
	        }
	    }
	}

}
