package java_method;
	import java.util.Scanner;

	public class NumberCheck {

	    public static int checkNumber(int number) {
	        if (number > 0) {
	            return 1;
	        } else if (number < 0) {
	            return -1;
	        } else {
	            return 0;
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int input = scanner.nextInt();
	        int result = checkNumber(input);
	        System.out.println("Result: " + result);
	    }
	}


