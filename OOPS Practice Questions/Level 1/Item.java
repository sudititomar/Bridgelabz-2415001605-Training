class Item {
    String itemCode;
    String itemName;
    double price;

    
    Item(String code, String name, double price) {
        this.itemCode = code;
        this.itemName = name;
        this.price = price;
    }

    
    void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: " + price);
    }

    
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item item = new Item("ITM101", "Laptop", 55000.0);
        item.displayItemDetails();
        int quantity = 3;
        System.out.println("Total cost for quantity " + quantity + ": " + item.calculateTotalCost(quantity));
    }
}
