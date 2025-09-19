import java.util.ArrayList;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Order {
    int orderId;
    ArrayList<Product> products;

    Order(int orderId) {
        this.orderId = orderId;
        products = new ArrayList<>();
    }

    void addProduct(Product product) {
        products.add(product);
    }

    void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products:");
        for (Product p : products) {
            System.out.println("- " + p.name + ": $" + p.price);
        }
    }
}

class Customer {
    String name;
    ArrayList<Order> orders;

    Customer(String name) {
        this.name = name;
        orders = new ArrayList<>();
    }

    void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed order " + order.orderId);
    }

    void showOrders() {
        System.out.println(name + "'s orders:");
        for (Order order : orders) {
            order.showOrderDetails();
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice");

        Product p1 = new Product("Laptop", 1200.00);
        Product p2 = new Product("Mouse", 25.50);
        Product p3 = new Product("Keyboard", 45.00);

        Order order1 = new Order(1001);
        order1.addProduct(p1);
        order1.addProduct(p2);

        Order order2 = new Order(1002);
        order2.addProduct(p3);

        customer.placeOrder(order1);
        customer.placeOrder(order2);

        customer.showOrders();
    }
}
