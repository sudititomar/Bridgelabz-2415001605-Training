public class WrapperDemo2 {
    public static void main(String[] args) {
        Double dbl = 45.67;
        double pDouble = dbl.doubleValue();
        int pInt = dbl.intValue();
        System.out.println("Double: " + pDouble);
        System.out.println("Int (cast): " + pInt);
    }
}
