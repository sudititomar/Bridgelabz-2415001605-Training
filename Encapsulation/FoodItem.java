abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public abstract double calculateTotalPrice();
    public String getItemDetails() {
        return itemName + " " + price + " " + quantity;
    }
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) { super(name, price, qty); }
    public double calculateTotalPrice() { return getPrice() * getQuantity(); }
    public double applyDiscount() { return getPrice() * 0.10; }
    public String getDiscountDetails() { return "10% deal"; }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int qty) { super(name, price, qty); }
    public double calculateTotalPrice() { return getPrice() * getQuantity() + 20; }
    public double applyDiscount() { return getPrice() * 0.05; }
    public String getDiscountDetails() { return "5% deal + ₹20 non-veg surcharge"; }
}
