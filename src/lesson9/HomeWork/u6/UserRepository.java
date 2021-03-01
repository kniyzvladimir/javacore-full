package lesson9.HomeWork.u6;

public class UserRepository {
    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User findById(long id) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getId() == id) {
                return users[i];
            }
        }
        return null;
    }

    public User update(User user) {
        for (int i = 0; i < users.length; i++){
            if (users[i] == user){
                users[i] = user;
                return user;
            }
        }
        return null;
    }

    public void delete(long id) {
        User user = findById(id);
        for (int i = 0; i < users.length; i++) {
            if (users[i] == user)
                users[i] = null;
        }
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