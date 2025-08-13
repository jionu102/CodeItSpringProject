package Head05_SOLID.example01_Open_CLosed_Principle;

public class PaymentProcessor {
    public void pay(Payment payment, double amount) {
        System.out.println("공통 처리 로직을 위한 PaymentProcessor 진입");
        payment.pay(amount);
    }
}
