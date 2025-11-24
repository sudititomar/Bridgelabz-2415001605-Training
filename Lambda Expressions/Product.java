import java.util.*;

class Product {
    String name; double price; double rating; int discount;
    Product(String n, double p, double r, int d) { name=n; price=p; rating=r; discount=d; }
    public String toString() { return name + ": ₹" + price + ", ⭐" + rating + ", -" + discount + "%"; }



    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 40000, 4.5, 10),
                new Product("Phone", 22000, 4.8, 15),
                new Product("TV", 30000, 4.3, 20)
        );
        // Sort by price
        products.sort((a, b) -> Double.compare(a.price, b.price));
        System.out.println("By Price: " + products);

        // Sort by rating
        products.sort((a, b) -> Double.compare(b.rating, a.rating));
        System.out.println("By Rating: " + products);

        // Sort by discount
        products.sort((a, b) -> Integer.compare(b.discount, a.discount));
        System.out.println("By Discount: " + products);
    }
}
