import java.util.*;

public class ReverseListDemo {
    public static void reverseList(List<Integer> list) {
        for (int i = 0, j = list.size()-1; i < j; i++, j--) {
            int tmp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, tmp);
        }
    }

    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        reverseList(arrList);
        System.out.println("Reversed ArrayList: " + arrList);

        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        reverseList(linkedList);
        System.out.println("Reversed LinkedList: " + linkedList);
    }
}
