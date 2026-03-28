import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    public static void generateException(String[] arr) {
        System.out.println(arr[arr.length]); // Access out of bounds index
    }

    public static void handleException(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException");
        }
    }

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sca.nextInt();

        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sca.next();
        }

        generateException(names);
        handleException(names);
    }
}
