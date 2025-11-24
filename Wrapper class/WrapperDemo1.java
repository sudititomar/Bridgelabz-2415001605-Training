import java.util.Scanner;
public class WrapperDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Integer obj = Integer.valueOf(num); // primitive to wrapper
        System.out.println("Primitive: " + num);
        System.out.println("Wrapper: " + obj);
    }
}
