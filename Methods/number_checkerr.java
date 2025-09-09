package java_method;

public class number_checkerr {
	public static boolean isPrime(int number) {
	        if (number <= 1) return false;
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) return false;
	        }
	        return true;
	    }

	    public static boolean isNeon(int number) {
	        int square = number * number;
	        int sum = 0;
	        while (square > 0) {
	            sum += square % 10;
	            square /= 10;
	        }
	        return sum == number;
	    }

	    public static boolean isSpy(int number) {
	        int sum = 0;
	        int product = 1;
	        int n = number;
	        while (n > 0) {
	            int digit = n % 10;
	            sum += digit;
	            product *= digit;
	            n /= 10;
	        }
	        return sum == product;
	    }

	    public static boolean isAutomorphic(int number) {
	        int square = number * number;
	        String strNum = String.valueOf(number);
	        String strSquare = String.valueOf(square);
	        return strSquare.endsWith(strNum);
	    }

	    public static boolean isBuzz(int number) {
	        return number % 7 == 0 || number % 10 == 7;
	    }

	    public static void main(String[] args) {
	        int[] testNumbers = {7, 9, 153, 25, 49, 7, 5, 13};

	        for (int num : testNumbers) {
	            System.out.println("Number: " + num);
	            System.out.println("Is Prime? " + isPrime(num));
	            System.out.println("Is Neon? " + isNeon(num));
	            System.out.println("Is Spy? " + isSpy(num));
	            System.out.println("Is Automorphic? " + isAutomorphic(num));
	            System.out.println("Is Buzz? " + isBuzz(num));
	            System.out.println();
	        }
	    }
	}

