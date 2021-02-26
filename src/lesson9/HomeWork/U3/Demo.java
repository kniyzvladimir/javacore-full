package lesson9.HomeWork.U3;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        User user1 = new User(654, "k", "kik");
        User user2 = new User(4, "jk", "kk");
        User user3 = new User(54, "kuyu", "kjmik");

        User[] users = {null, null, null, null, user1, user2, user3};
        UserRepository userRepository = new UserRepository(users);

        System.out.println(userRepository.getUserBiId(654));
        System.out.println(userRepository.getUserByName("jk"));
        System.out.println(userRepository.getUserBySessionId("kj"));
    }

}
