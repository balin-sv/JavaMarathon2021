package Day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {

    private static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text) {
        Message aux = new Message(u1, u2, text);
        messages.add(aux);
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {

        for (Message message : messages) {

            if (message.getSender().getUsername().equals(u1.getUsername())
                    && message.getReceiver().getUsername().equals(u2.getUsername())) {
                System.out.println(message.getSender() + ":" + message.getText());

            } else if ((message.getSender().getUsername().equals(u2.getUsername())
                    && message.getReceiver().getUsername().equals(u1.getUsername()))) {
                System.out.println(message.getSender() + ":" + message.getText());

            }
        }

    }

}

