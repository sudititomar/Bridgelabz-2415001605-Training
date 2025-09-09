package java_method;
	import java.util.Arrays;

	public class numberr_checker {
	    public static int countDigits(int number) {
	        return String.valueOf(Math.abs(number)).length();
	    }

	    public static int[] digitsArray(int number) {
	        String numStr = String.valueOf(Math.abs(number));
	        int[] digits = new int[numStr.length()];
	        for (int i = 0; i < numStr.length(); i++) {
	            digits[i] = numStr.charAt(i) - '0';
	        }
	        return digits;
	    }

	    public static int[] reverseDigitsArray(int[] digits) {
	        int[] reversed = new int[digits.length];
	        for (int i = 0; i < digits.length; i++) {
	            reversed[i] = digits[digits.length - 1 - i];
	        }
	        return reversed;
	    }

	    public static boolean compareArrays(int[] arr1, int[] arr2) {
	        if (arr1.length != arr2.length) return false;
	        for (int i = 0; i < arr1.length; i++) {
	            if (arr1[i] != arr2[i]) return false;
	        }
	        return true;
	    }

	    public static boolean isPalindrome(int number) {
	        int[] digits = digitsArray(number);
	        int[] reversed = reverseDigitsArray(digits);
	        return compareArrays(digits, reversed);
	    }

	    public static boolean isDuckNumber(int number) {
	        int[] digits = digitsArray(number);
	        for (int digit : digits) {
	            if (digit != 0) {
	                return true;
	            }
	        }
	        return false;
	    }

	    public static void main(String[] args) {
	        int number = 1221;

	        System.out.println("Number: " + number);
	        System.out.println("Count of digits: " + countDigits(number));

	        int[] digits = digitsArray(number);
	        System.out.println("Digits array: " + Arrays.toString(digits));

	        int[] reversed = reverseDigitsArray(digits);
	        System.out.println("Reversed digits array: " + Arrays.toString(reversed));

	        System.out.println("Is palindrome? " + isPalindrome(number));
	        System.out.println("Is duck number? " + isDuckNumber(number));
	    }
	}

