package lesson9.HomeWork.u6;

public class Demo {
    public static void main(String[] args) {
        User user1 = new User(654, "A", "kik");
        User user2 = new User(4, "B", "kk");
        User user3 = new User(54, "C", "kjmik");
        User user4 = new User(52, "D", "mik");



        User[] users = {null, null, null, null, user1, user2, user3};
        UserRepository userRepository = new UserRepository(users);

        System.out.println(userRepository.save(user3));
        System.out.println(userRepository.save(user4).getName());

    }

}
