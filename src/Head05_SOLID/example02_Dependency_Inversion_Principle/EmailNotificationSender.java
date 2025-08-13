package Head05_SOLID.example02_Dependency_Inversion_Principle;

public class EmailNotificationSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("이메일 전송: " + message);
    }
}
