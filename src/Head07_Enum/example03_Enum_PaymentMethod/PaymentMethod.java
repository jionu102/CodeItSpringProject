package Head07_Enum.example03_Enum_PaymentMethod;

public enum PaymentMethod {
    CREDIT_CART("카드 결제"),
    ACCOUNT_TRANSFER("현금 결제"),
    MOBILE_PAYMENT("모바일 결제");

    private final String displayName;

    PaymentMethod(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
