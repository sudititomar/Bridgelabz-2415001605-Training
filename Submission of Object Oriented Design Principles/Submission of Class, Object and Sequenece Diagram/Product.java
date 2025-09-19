import java.util.ArrayList;

class Product {
    String name;
    double quantity;
    double pricePerUnit;

    Product(String name, double quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    double getTotalPrice() {
        return quantity * pricePerUnit;
    }
}

class Customer {
    String name;
    ArrayList<Product> products;

    Customer(String name) {
        this.name = name;
        products = new ArrayList<>();
    }

    void buyProduct(Product product) {
        products.add(product);
    }
}

class BillGenerator {
    double calculateTotal(Customer customer) {
        double total = 0;
        for (Product p : customer.products) {
            total += p.getTotalPrice();
        }
        return total;
    }

    void printBill(Customer customer) {
        System.out.println("Bill for " + customer.name);
        for (Product p : customer.products) {
            System.out.println(p.name + ": " + p.quantity + " units @ $" + p.pricePerUnit + " each, Total: $" + p.getTotalPrice());
        }
        System.out.println("Total Bill Amount: $" + calculateTotal(customer));
    }
}

public class Main {
    public static void main(String[] args) {
        Customer alice = new Customer("Alice");
        alice.buyProduct(new Product("Apples", 2, 3));  // 2 kg at $3/kg
        alice.buyProduct(new Product("Milk", 1, 2));    // 1 liter at $2/liter

        BillGenerator billGen = new BillGenerator();
        billGen.printBill(alice);
    }
}
