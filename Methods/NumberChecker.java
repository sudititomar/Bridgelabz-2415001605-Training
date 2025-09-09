package java_method;
public class NumberChecker {

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

    public static boolean isDuckNumber(int number) {
        int[] digits = digitsArray(number);
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check if the number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int[] digits = digitsArray(number);
        int power = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == Math.abs(number);
    }
    public static int[] largestTwo(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[] {largest, secondLargest};
    }

    public static int[] smallestTwo(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[] {smallest, secondSmallest};
    }

    public static void main(String[] args) {
        int number = 153; 

        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + countDigits(number));

        int[] digits = digitsArray(number);
        System.out.print("Digits array: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        System.out.println("Is Duck Number? " + isDuckNumber(number));
        System.out.println("Is Armstrong Number? " + isArmstrong(number));

        int[] largest = largestTwo(digits);
        System.out.println("Largest digit: " + largest[0]);
        System.out.println("Second largest digit: " + (largest[1] == Integer.MIN_VALUE ? "None" : largest[1]));

        int[] smallest = smallestTwo(digits);
        System.out.println("Smallest digit: " + smallest[0]);
        System.out.println("Second smallest digit: " + (smallest[1] == Integer.MAX_VALUE ? "None" : smallest[1]));
    }
}
