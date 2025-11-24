import java.util.*;

public class ListRotate{
    public static List<Integer> rotateList(List<Integer> l, int n) {
        List<Integer> rotated = new ArrayList<>();
        int size = l.size();
        for (int i = 0; i < size; i++)
            rotated.add(l.get((i + n) % size));
        return rotated;
    }

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(10, 20, 30, 40, 50);
        System.out.println("Rotated list: " + rotateList(l, 2));
    }
}
