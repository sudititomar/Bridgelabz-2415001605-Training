class OutOfStockException extends Exception { public OutOfStockException(String msg) { super(msg); } }
class PaymentFailedException extends Exception { public PaymentFailedException(String msg) { super(msg); } }
class Order {
    public void placeOrder() throws OutOfStockException, PaymentFailedException {
        double r = Math.random();
        if(r < 0.5) throw new OutOfStockException("Product is out of stock!");
        else throw new PaymentFailedException("Payment failed!");
    }
}
public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        try {
            order.placeOrder();
        } catch(OutOfStockException | PaymentFailedException e) {
            System.out.println(e.getMessage());
        }
    }
}
