package Open_Close_Principle;
import java.util.List;


//Problematic code
class NotificationSenderMonster{
    public void sendNotification(List<String>notificationTypes, String message){
        for(String notificationType : notificationTypes){
            switch (notificationType){
                case "Email":
                    EmailNotification notification = new EmailNotification();
                    notification.sendMessage(message);
                    break;
                case "SMS":
                    SMSNotification smsnotification = new SMSNotification();
                    smsnotification.sendMessage(message);
                    break;
//                case "PUSH":
//                    PushNotification notification = new PushNotification();
//                    notification.sendMessage(message);
//                    break;
            }
        }
    }
}

//Improve code follows OCP
interface Notification{
    void sendMessage(String message);
}

class SMSNotification implements Notification{
    @Override
    public void sendMessage(String message){
        System.out.println("SMS_Message - " + message);
    }
}

class EmailNotification implements Notification{
    @Override
    public void sendMessage(String message){
        System.out.println("Email_Message - " + message);
    }
}

class NotiicationSender{
    public void sendNotification(List<Notification>notifications, String message){
        for(Notification notification : notifications){
            notification.sendMessage(message);
        }
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
