package Head03_ClassAndObject.example04;

import Head03_ClassAndObject.example01.Order;

public class PaymentService {
    private static PaymentService INSTANCE = new PaymentService();

    //외부 생성 차단
    private PaymentService() {}

    public static PaymentService getInstance() {return INSTANCE;}

    public boolean pay (Order order, double amount) {
        //결제 처리 로직
        return true;
    }
}
