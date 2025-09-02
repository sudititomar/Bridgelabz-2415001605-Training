import java.util.Scanner;

public class StringCompare {


    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 

        String firstString = in.next(); 
        String secondString = in.next(); 

        boolean resultCharAt = compareStrings(firstString, secondString);


        boolean resultEquals = firstString.equals(secondString);

        System.out.println("Result of compare using charAt(): " + resultCharAt);
        System.out.println("Result of compare using equals(): " + resultEquals);

        if (resultCharAt == resultEquals) {
            System.out.println("Both methods returned the same result!");
        } else {
            System.out.println("The methods returned different results.");
        }

        
    }
}
