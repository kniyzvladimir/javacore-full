package lesson9;

public class UserRepository {
    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public String[] getUserNames() {
        int lenArray = users.length;
        String[] usersNames = new String[lenArray];
        for (int i = 0; i < lenArray; i++) {
            usersNames[i] = users[i].getName();
        }
        return usersNames;
    }

    public long[] getUserIds() {
        int lenArray = users.length;
        long[] usersIds = new long[lenArray];
        for (int i = 0; i < lenArray; i++) {
            usersIds[i] = users[i].getId();
        }
        return usersIds;
    }

    public String getUserNameById(long id) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getId() == id) {
                return users[i].getName();
            }
        }
        return null;
    }
}

