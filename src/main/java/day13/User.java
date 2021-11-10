package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    String username;
    List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<User> getSubscription() {
        return subscriptions;
    }

    public void setSubscription(List<User> subscription) {
        this.subscriptions = subscription;
    }

    public void subscribe(User user) {

        this.subscriptions.add(user);

    }

    public boolean isSubscribed(User user) {
        for (User us : subscriptions) {
            if (us.getUsername().equals(user.getUsername())) {
                return true;
            }
        }
        return false;
    }


    public boolean isFriend(User user){
        return this.isSubscribed(user) && user.isSubscribed(this);

    }

    public void sendMessage(User user, String text){
        MessageDatabase.addNewMessage(this,user,text);

    }


    @Override
    public String toString() {
        return username ;
    }
}
