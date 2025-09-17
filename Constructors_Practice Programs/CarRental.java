class Book {
    String title;
    String author;
    double price;

    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.displayDetails();

        Book b2 = new Book("Java Basics", "James Gosling", 499.99);
        b2.displayDetails();
    }
}
