abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public abstract double calculateDiscount();
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) { super(id, name, price); }
    public double calculateDiscount() { return getPrice() * 0.1; }
    public double calculateTax() { return getPrice() * 0.18; }
    public String getTaxDetails() { return "18% GST"; }
}

class Clothing extends Product implements Taxable {
    public Clothing(int id, String name, double price) { super(id, name, price); }
    public double calculateDiscount() { return getPrice() * 0.2; }
    public double calculateTax() { return getPrice() * 0.05; }
    public String getTaxDetails() { return "5% GST"; }
}

class Groceries extends Product implements Taxable {
    public Groceries(int id, String name, double price) { super(id, name, price); }
    public double calculateDiscount() { return getPrice() * 0.05; }
    public double calculateTax() { return 0; }
    public String getTaxDetails() { return "No tax"; }
}
