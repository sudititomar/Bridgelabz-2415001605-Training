class Fruit { public String getName() { return getClass().getSimpleName(); } }
class Apple extends Fruit {}
class Mango extends Fruit {}
// class Car {} // uncommenting this later will not compile with FruitBox<>

import java.util.*;

public class FruitBox<T extends Fruit> {
    private List<T> items = new ArrayList<>();
    public void add(T fruit) { items.add(fruit); }
    public void display() {
        for (T f : items) System.out.println(f.getName());
    }

    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.add(new Apple());
        appleBox.display();

        FruitBox<Fruit> mixedBox = new FruitBox<>();
        mixedBox.add(new Apple());
        mixedBox.add(new Mango());
        mixedBox.display();
        // FruitBox<Car> carBox = new FruitBox<>(); // This line will give a compile-time error!
    }
}
