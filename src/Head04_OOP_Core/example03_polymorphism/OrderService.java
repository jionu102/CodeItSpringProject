package Head04_OOP_Core.example03_polymorphism;

public class OrderService {
    public void processPayment(Payment method, double amount) {
        method.pay(amount);
    }
}
