package lesson9;

public class UserRepository {
    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    private User findById(long id) { // не понятно как я эту функцию должен использовать в User save(User user)
        for (int i = 0; i < users.length; i++)
            if (users[i].getId() == id)
                return users[i];
        return null;
    }

    public User save(User user) {
        int freeIndex = -1;
        for (int i = 0; i < users.length; i++) {
            if (users[i] == user)
                return null;
            freeIndex = users[i] == null ? i : freeIndex;
        }
        if (freeIndex == -1)
            return null;
        users[freeIndex] = user;
        return user;
    }
}

