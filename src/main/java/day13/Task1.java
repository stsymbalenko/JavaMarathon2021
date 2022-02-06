package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Sergey");
        User user2 = new User("Mike");
        User user3 = new User("David");

        user1.sendMessage(user2, "Hi!");
        user1.sendMessage(user2, "How do you do");
        user2.sendMessage(user1, "Hi!");
        user2.sendMessage(user1, "I am working");
        user2.sendMessage(user1, "How are you doing");
        user3.sendMessage(user1, "Hi!");
        user3.sendMessage(user1, "How do you do");
        user3.sendMessage(user1, "How are you doing");
        user1.sendMessage(user3, "Hello");
        user1.sendMessage(user3, "I'm working");
        user1.sendMessage(user3,"I'm all good");
        user3.sendMessage(user1,"My name is David");

        MessageDatabase.showDialog(user1,user3);

    }
}
