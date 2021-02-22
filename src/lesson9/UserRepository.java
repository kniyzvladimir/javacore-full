package lesson9;

public class UserRepository {
    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User getUserByName(String name) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getName().equals(name)) {
                return users[i];
            }
        }
        return null;
    }

    private User getUserById(long id) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getId() == id) {
                return users[i];
            }
        }
        return null;
    }

    public User getUserBySessionId(String sessionId) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getSessionId() == sessionId) {
                return users[i];
            }
        }
        return null;
    }
}
