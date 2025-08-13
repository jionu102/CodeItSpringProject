package Head05_SOLID.example02_Dependency_Inversion_Principle;

public class SmsNotificationSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("SMS 전송: " + message);
    }
}
