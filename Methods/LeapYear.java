package java_method;
	import java.util.Scanner;

	public class LeapYear {

	    public static boolean isLeapYear(int year) {
	        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a year (>= 1582): ");
	        int year = scanner.nextInt();

	        if (year < 1582) {
	            System.out.println("Invalid input. The year must be 1582 or later.");
	        } else {
	            if (isLeapYear(year)) {
	                System.out.println(year + " is a Leap Year.");
	            } else {
	                System.out.println(year + " is not a Leap Year.");
	            }
	        }
	}

}
