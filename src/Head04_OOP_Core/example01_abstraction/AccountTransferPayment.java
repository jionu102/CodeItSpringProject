package Head04_OOP_Core.example01_abstraction;

public class AccountTransferPayment extends AbstractPayment {
    @Override
    public void pay(double amount) {
        System.out.println("계좌이체로 " + amount + "원 결제 완료.");
    }

    @Override
    public void cancel(double amount) {
        System.out.println("게좌이체로 " + amount + "원 취소 완료.");
    }
}
