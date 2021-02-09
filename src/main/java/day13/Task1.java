
package Day13;

import static Day13.MessageDatabase.*;


public class Task1 {

    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        addNewMessage(user1, user2, "privet!");
        addNewMessage(user1, user2, "kak dela?");

        addNewMessage(user2, user1, "dela normalno");
        addNewMessage(user2, user1, "kak u tebia?");
        addNewMessage(user2, user1, "nichego novogo");

        addNewMessage(user1, user3, "privet!");
        addNewMessage(user1, user3, "napishi chto nibud");
        addNewMessage(user1, user3, "skuchno");

        addNewMessage(user3, user1, "privet!");

        System.out.println(getMessages());
        showDialog(user1, user3);

        user1.subscribe(user2);
        user2.subscribe(user1);
        System.out.println(user1.isSubscribed(user2));
        System.out.println(user2.isSubscribed(user1));
        System.out.println(user1.isFriend(user2));
        System.out.println(user1.isFriend(user3));

    }

}
