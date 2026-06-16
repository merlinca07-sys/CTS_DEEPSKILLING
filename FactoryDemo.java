interface Notification {
    void sendMessage();
}

class EmailNotification implements Notification {

    @Override
    public void sendMessage() {
        System.out.println("Email notification sent successfully");
    }
}

class SmsNotification implements Notification {

    @Override
    public void sendMessage() {
        System.out.println("SMS notification sent successfully");
    }
}

class NotificationFactory {

    public Notification createNotification(String notificationType) {

        if (notificationType == null) {
            return null;
        }

        if (notificationType.equalsIgnoreCase("EMAIL")) {
            return new EmailNotification();
        }

        if (notificationType.equalsIgnoreCase("SMS")) {
            return new SmsNotification();
        }

        return null;
    }
}

public class FactoryDemo {

    public static void main(String[] args) {

        NotificationFactory factoryObj = new NotificationFactory();

        Notification emailObj = factoryObj.createNotification("EMAIL");
        emailObj.sendMessage();

        Notification smsObj = factoryObj.createNotification("SMS");
        smsObj.sendMessage();
    }
}