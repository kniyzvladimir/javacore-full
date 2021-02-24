package lesson9.HomeWork;

import java.util.Arrays;

public class UserRepositoryP2 {
    public static void main(String[] args) {
        User user1 = new User(654, "k", "kik");
        User user2 = new User(4, "jk", "kk");
        User user3 = new User(54, "kuyu", "kjmik");

        User[] users = {null, null, null, null, user1, user2, user3};
        UserRepositoryP2 userRepositoryP2 = new UserRepositoryP2(users);
        System.out.println(Arrays.toString(userRepositoryP2.getUserNames()));
        System.out.println(Arrays.toString(userRepositoryP2.getUserIds()));
        System.out.println(userRepositoryP2.getUserNameById(54));
    }

    private User[] users;

    public UserRepositoryP2(User[] users) {
        this.users = users;
    }

    private int lenArray() {
        int lenArray = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null)
                lenArray++;
        }
        return lenArray;
    }

    public String[] getUserNames() {
        int index = 0;
        String[] usersNames = new String[lenArray()];
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null)
                continue;
            else {
                usersNames[index] = users[i].getName();
                index++;
            }
        }
        return usersNames;
    }

    public long[] getUserIds() {
        int index = 0;
        long[] usersIds = new long[lenArray()];
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null)
                continue;
            else {
                usersIds[index] = users[i].getId();
                index++;
            }
        }
        return usersIds;
    }

    public String getUserNameById(long id) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null)
                continue;
            else if (users[i].getId() == id)
                return users[i].getName();
        }
        return null;
    }
}


