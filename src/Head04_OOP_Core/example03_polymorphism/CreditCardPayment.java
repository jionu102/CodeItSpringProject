package Head04_OOP_Core.example03_polymorphism;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("신용카드로 " + amount + "원 결제 완료.");
    }

    @Override
    public void cancel(double amount) {
        System.out.println("신용카드로 " + amount + "원 취소 완료.");
    }
}
