package lesson9.HomeWork;

import java.util.Arrays;

public class UserRepositoryP2 {
    public static void main(String[] args) {
        User [] users = new User[10];
        UserRepositoryP2 userRepositoryP2 = new UserRepositoryP2(users);
        System.out.println(userRepositoryP2.getUserNameById(5));
    }

    private User[] users;

    public UserRepositoryP2(User[] users) {
        this.users = users;
    }

    public String[] getUserNames() {
        int lenArray = users.length;
        String[] usersNames = new String[lenArray];
        for (int i = 0; i < lenArray; i++) {
            if (users[i] == null)
                usersNames[i] = null;
            else
                usersNames[i] = users[i].getName();
        }
        return usersNames;
    }

    public long[] getUserIds() {
        int lenArray = users.length;
        long[] usersIds = new long[lenArray];
        for (int i = 0; i < lenArray; i++) {
            if (users[i] == null)
                usersIds[i] = 0;
            else
                usersIds[i] = users[i].getId();
        }
        return usersIds;
    }

    public String getUserNameById(long id) {
        int count = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i]==null)
                count++;
            else if (users[i].getId() == id)
                return users[i].getName();
            if (count == users.length)
                return null;
        }
        return null;
    }
}


