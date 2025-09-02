public class NullPointerDemo {

    public static void generateException() {
        String text = null;
        printLength(text);
    }

    public static void printLength(String str) {
        System.out.println(str.length());
    }

    public static void handleException() {
        String text = null;
        try {
            printLength(text);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException");
        }
    }

    public static void main(String[] args) {
        generateException();
        handleException();
    }
}
