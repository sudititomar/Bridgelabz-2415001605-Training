import java.util.*;
public class WrapperDemo3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5); list.add(10); list.add(20); list.add(7); list.add(13); // auto-boxing
        int sum = 0;
        for(Integer i : list) sum += i; // auto-unboxing
        System.out.println("Sum of numbers = " + sum);
    }
}
