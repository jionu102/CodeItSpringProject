package Head04_OOP_Core.example01_abstraction;

public class CryptoPayment extends AbstractPayment {
    @Override
    public void pay(double amount) {
        System.out.println("암호화폐로 " + amount + "원 결제 완료.");
    }

    @Override
    public void cancel(double amount) {
        System.out.println("암호화폐로 " + amount + "원 취소 완료.");
    }
}
