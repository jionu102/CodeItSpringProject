package Head05_SOLID.example01_Open_CLosed_Principle;

public class PaymentProcessorTest {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        Payment[] payments = {new AccountTransferPayment(), new MobilePayment(), new CreditCardPayment()};

        int[] amount = {10000, 20000, 30000};
        int index = 0;

        for (Payment p : payments) {
            paymentProcessor.pay(p, amount[index++]);
        }
    }
}
