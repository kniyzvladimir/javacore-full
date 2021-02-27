package lesson9.HomeWork.u4;


public class UserRepository {
    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    private User findById(long id) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getId() == id) {
                return users[i];
            }
        }
        return null;
    }

    public User save(User user) {
        if (findById(user.getId()) == user)
            return null;
        for (int i = 0; i < users.length; i++){
            if (users[i] == null) {
                users[i] = user;
                return user;
            }
        }
        return null;
    }

}