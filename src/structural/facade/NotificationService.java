package structural.facade;

public class NotificationService {
    // The message does not use the Message class because the client that uses the NotificationService does not need to be coupled with the Message class.
    public void send(String message, String target){
        NotificationServer server = new NotificationServer();
        Connection connection = server.connect("ip");
        AuthToken authToken = server.authenticate("APP_ID", "key");
        server.send(authToken, new Message(message), target);
        connection.disconnect();
    }
}
