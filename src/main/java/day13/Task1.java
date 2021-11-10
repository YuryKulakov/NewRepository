package day13;

import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Genry");
        User user2 = new User("John");
        User user3 = new User("Kate");

        user1.sendMessage(user2,"Hi! My name is Genry.");
        user1.sendMessage(user2,"I`m from Great Britain");

        user2.sendMessage(user1,"Hello. I am John.");
        user2.sendMessage(user1,"I`m from California.");
        user2.sendMessage(user1,"Do u like hockey?");

        user3.sendMessage(user1,"Hi Genry, how are u?");
        user3.sendMessage(user1,"I am going to work.");
        user3.sendMessage(user1,"Can you help me?");

        user1.sendMessage(user3,"Yo, Kate.");
        user1.sendMessage(user3,"I`m fine.");
        user1.sendMessage(user3,"No problem, i can help you.");

        user3.sendMessage(user1,"Good, thanks.");






    }
}
