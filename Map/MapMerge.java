import java.util.*;

public class MapMerge {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>(); map1.put("A", 1); map1.put("B", 2);
        Map<String, Integer> map2 = new HashMap<>(); map2.put("B", 3); map2.put("C", 4);
        map2.forEach((k, v) -> map1.merge(k, v, Integer::sum));
        System.out.println("Merged map: " + map1); // {A=1, B=5, C=4}
    }
}
