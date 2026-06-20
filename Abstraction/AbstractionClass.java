package Abstraction;

abstract class Payment {
    abstract void pay(double amount);

    void paymentStatus() {
        System.out.println("Payment is being processed...");
    }
}

class UPI extends Payment {
    void pay(double amount) {
        System.out.println("Paid using UPI: " + amount);
    }
}

class Card extends Payment {
    void pay(double amount) {
        System.out.println("Paid using Card: " + amount);
    }
}

public class AbstractionClass {
    public static void main(String[] args) {
        Payment obj = new UPI();
        obj.paymentStatus();
        obj.pay(500);
    }
}
