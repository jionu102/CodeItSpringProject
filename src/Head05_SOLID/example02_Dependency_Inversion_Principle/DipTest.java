package Head05_SOLID.example02_Dependency_Inversion_Principle;

public class DipTest {
    public static void main(String[] args) {
        NotificationService service;
        NotificationSender[] senders = {new EmailNotificationSender(), new SmsNotificationSender()};

        for (NotificationSender sender : senders) {
            service = new NotificationService(sender);
            service.notify("Hello World");
        }
    }
}

