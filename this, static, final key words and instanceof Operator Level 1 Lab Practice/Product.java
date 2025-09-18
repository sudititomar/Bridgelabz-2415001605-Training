public class Product {
    private static double discount = 0.0;  // static discount for all products
    private final String productID;         // final unique identifier
    private String productName;
    private double price;
    private int quantity;

    // Constructor using 'this' to initialize variables
    public Product(String productName, double price, int quantity, String productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // Static method to update the discount percentage
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Method to display product details with instanceof validation
    public void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID (final): " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        } else {
            System.out.println("Not a Product instance");
        }
    }

    // Getters and setters (no setter for productID since it's final)
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductID() {
        return productID;
    }

    public static double getDiscount() {
        return discount;
    }
}
