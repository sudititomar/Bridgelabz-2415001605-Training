abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }
    public int getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public abstract int getLoanDuration();
    public String getItemDetails() {
        return itemId + " " + title + " " + author;
    }
}

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    public Book(int id, String title, String author) { super(id, title, author); }
    public int getLoanDuration() { return 21; }
    public void reserveItem() {}
    public boolean checkAvailability() { return true; }
}

class Magazine extends LibraryItem implements Reservable {
    public Magazine(int id, String title, String author) { super(id, title, author); }
    public int getLoanDuration() { return 7; }
    public void reserveItem() {}
    public boolean checkAvailability() { return true; }
}

class DVD extends LibraryItem implements Reservable {
    public DVD(int id, String title, String author) { super(id, title, author); }
    public int getLoanDuration() { return 14; }
    public void reserveItem() {}
    public boolean checkAvailability() { return false; }
}

