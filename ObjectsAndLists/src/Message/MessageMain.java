package Message;

public class MessageMain {
    public static void main(String[] args) {
        Message message = new Message("Miguel", "Hello :P");
        MessagingService service = new MessagingService();

        service.add(message);
        System.out.println(service.getMessages());
    }
}