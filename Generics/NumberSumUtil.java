import java.util.*;

public class NumberSumUtil {
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) sum += n.doubleValue();
        return sum;
    }
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(2, 4, 6);
        List<Double> dblList = Arrays.asList(1.5, 2.5, 3.0);
        System.out.println(sumNumbers(intList)); // 12.0
        System.out.println(sumNumbers(dblList)); // 7.0
    }
}
