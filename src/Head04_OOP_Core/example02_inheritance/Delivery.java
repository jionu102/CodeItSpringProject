package Head04_OOP_Core.example02_inheritance;

public class Delivery {
    private String trackingNumber;
    private String carrier;

    public Delivery(String trackingNumber, String carrier) {
        this.trackingNumber = trackingNumber;
        this.carrier = carrier;
    }

    public void startDelivery() {
        System.out.println("배송 시작 - 운송장 번호: " + trackingNumber);
    }
}
