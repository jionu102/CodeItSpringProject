package Head04_OOP_Core.example04_encapsulation;

public class PaymentServiceTest{
    public static void main(String[] args) {
        //UserAccount 객체 생성
        UserAccount account = new UserAccount("testId");

        //PaymentService 객체 생성
        PaymentService paymentService = new PaymentService();

        // 정상 입금 테스트
        account.deposit(5000);

        //System.out.println으로 잔액 조회
        System.out.println("balance: " + account.getBalance());

        // 1. 음수 입금 테스트
        try {
            account.deposit(-5000);
        } catch (IllegalArgumentException e) {
            System.out.println("예외 발생 (음수 입금): " + e.getMessage());
        }

        // 2. 음수 출금 테스트
        try {
            account.withdraw(-5000);
        } catch (IllegalStateException e) {
            System.out.println("예외 발생 (음수 출금): " + e.getMessage());
        }

        // 3. 잔액 부족 출금 테스트
        try {
            account.withdraw(10000);
        } catch (IllegalStateException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }

        // 4. 정상 결제
        paymentService.processPayment(account, 1000);

        // 5 정상 환불
        paymentService.processRefund(account, 1000);
    }
}