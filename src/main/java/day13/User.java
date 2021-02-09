package Day13;

import java.util.ArrayList;
import java.util.List;


public class User {

    private final String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    @Override
    public String toString() {
        return username;
    }

    public void subscribe(User a) {

        subscriptions.add(a);

    }

    public boolean isSubscribed(User user) {
        boolean aux;
        aux = subscriptions.contains(user);
        return aux;
    }

    public boolean isFriend(User user) {
        boolean aux;
        if (user.subscriptions.contains(this) && this.subscriptions.contains(user)) {
            aux = true;
        } else {
            aux = false;
        }
        return aux;
    }

}
