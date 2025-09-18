public class Book {
    private static String libraryName = "GLA University Library";
    private final String isbn;  // final variable
    private String title;
    private String author;

    // Constructor using 'this' to initialize variables
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public String getISBN() {
        return isbn;
    }

    public void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN (final): " + isbn);
        } else {
            System.out.println("Not a Book instance");
        }
    }

    // Getters and setters (only for title and author since isbn is final)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
