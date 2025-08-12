package Head04_OOP_Core.example01_abstraction;

public class Topic03ExampleMain {
    public static void main(String[] args) {
        Order o1 = new Order(new CreditCardPayment());
        o1.process(50000);

        System.out.println("----------------------------");

        Order o2 = new Order(new AccountTransferPayment());
        o2.process(30000);

        System.out.println("----------------------------");

        Order o3 = new Order(new CryptoPayment());
        o3.process(20000);
    }
}