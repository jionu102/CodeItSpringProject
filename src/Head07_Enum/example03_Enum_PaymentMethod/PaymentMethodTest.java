package Head07_Enum.example03_Enum_PaymentMethod;

public class PaymentMethodTest {
    public static void main(String[] args) {
        for (PaymentMethod pm : PaymentMethod.values()) {
            System.out.println(pm.getDisplayName());
            System.out.println(pm.name());
            System.out.println(pm.ordinal());
        }
    }
}
