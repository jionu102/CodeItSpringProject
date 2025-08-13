package Head07_Enum.example03_Enum_PaymentMethod;

import java.util.Random;

public class PaymentMethodTest {
    public static void main(String[] args) {
        for (PaymentMethod pm : PaymentMethod.values()) {
            System.out.println(pm.getDisplayName());
            System.out.println(pm.name());
            System.out.println(pm.ordinal());
        }

        PaymentMethod[] methods = PaymentMethod.values();
        Random rand = new Random();
        PaymentMethod method =  methods[rand.nextInt(methods.length)];

        System.out.println("------------------------------------------");

        switch (method) {
            case CREDIT_CARD:
                System.out.println("신용카드 결제 선택");
                break;
            // 나머지 방식도 처리
            case MOBILE_PAYMENT:
                System.out.println("모바일 결제 선택");
                break;
            case ACCOUNT_TRANSFER:
                System.out.println("현금 결제 선택");
                break;
        }
    }
}
