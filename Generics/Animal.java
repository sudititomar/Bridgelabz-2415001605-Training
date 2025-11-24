import java.util.*;

class Animal { public String getType() { return getClass().getSimpleName(); } }
class Dog extends Animal { }
class Cat extends Animal { }

public class AnimalUtil {
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) System.out.println(a.getType());
    }
    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList(new Dog(), new Dog());
        List<Cat> cats = Arrays.asList(new Cat());
        printAnimals(dogs); // Dog Dog
        printAnimals(cats); // Cat
    }
}
