package Head04_OOP_Core.example01_abstraction;

public class Order {
    private AbstractPayment payment;

    public Order(AbstractPayment payment) {
        this.payment = payment;
    }

    public void process(double amount) {
        payment.pay(amount);
        payment.cancel(amount);
    }
}
