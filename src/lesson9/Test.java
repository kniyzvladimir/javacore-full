package lesson9;

public class Test {
private User[] users;

public UserRepository(User[] users) {
        this.users = users;
        }

public User[] getUsers() {
        return users;
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

public String getUsersNameById(long id) {
        String name;
        for (int i = 0; i < users.length; i++) {
        if (users[i].getId() == id) {
        name = users[i].getName();
        return name;
        }
        }
        return null;
        }

public User getUserByName(String name) {
        for (int i = 0; i < users.length; i++) {
        if (users[i].getName().equals(name)) {
        return users[i];
        }
        }
        return null;
        }

private User findById(long id) {
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

private int freeIndex() {
        int freeIndex;
        for (int i = 0; i < users.length; i++) {
        if (users[i] == null) {
        freeIndex = i;
        return freeIndex;
        }
        }
        return -1;
        }

public User save(User user) {
        int freeIndex = freeIndex();
        if (freeIndex == -1)
        return null;
        if (findById(user.getId()) == user)
        return null;
        users[freeIndex] = user;
        return user;
        }

public User update(User user) {
        for (int i = 0; i < users.length; i++) {
        if (users[i] == user) {
        users[i] = user;
        return user;
        }
        }
        return null;
        }

public void delete(long id) {
        for (int i = 0; i < users.length; i++) {
        if (users[i].getId() == id)
        users[i] = null;
        }
        }

        }

