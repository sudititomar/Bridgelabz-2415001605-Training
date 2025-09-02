
import java.util.Scanner;

class harryage {
    public static void main(String[] args) {
        int currentyear=2024;
        Scanner sc = new Scanner(System.in);
        int birthyear= sc.nextInt();
        int harryAge = currentyear-birthyear;
        System.out.println(" Harry's age in 2024 is: " + harryAge);
    }
}