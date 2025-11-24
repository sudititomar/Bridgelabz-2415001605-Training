interface Payment {
    void pay(double amount);
}
class UPI implements Payment {
    public void pay(double amt) { System.out.println("Paid via UPI: " + amt); }
}
class CreditCard implements Payment {
    public void pay(double amt) { System.out.println("Paid via Credit Card: " + amt); }
}
class Wallet implements Payment {
    public void pay(double amt) { System.out.println("Paid via Wallet: " + amt); }
}
