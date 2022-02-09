package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    List<User> subscriptions;

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

    public void subscribe(User user){
        this.subscriptions.add(user);
    }

    public boolean isSubscribed(User user){
        /*boolean fl = false;
        for(User users : this.subscriptions){
            if(users.equals(user)){
                fl =  true;
            }else{
                fl =  false;
            }
        }
        return fl;*/
        return subscriptions.contains(user);
    }

    public boolean isFriend(User user){
        /*boolean flThis = false;
        boolean fl = false;
        boolean flUser = false;

        for(User users : this.subscriptions){
            if(users.equals(user)){
                flThis =  true;
            }else{
                flThis =  false;
            }
        }

        for(User users : user.subscriptions){
            if(users.equals(this)){
                flUser =  true;
            }else{
                flUser =  false;
            }
        }

        if(flThis && flUser){
            fl = true;
        }else{
            fl = false;
        }
        return fl;*/
        return subscriptions.contains(user) && user.getSubscriptions().contains(this);
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }

    @Override
    public String toString() {
        return username;
    }
}
