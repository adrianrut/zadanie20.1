package pl.rutkowski.zadanie20_1;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserList {
    private final List<User> userList = new ArrayList<>();

    public UserList() {
        userList.add(new User("Jan", "Kowalski", 30));
        userList.add(new User("Andrzej", "Nowak", 45));
        userList.add(new User("Zenon", "Kwiatkowski", 30));
    }

    public List<User> getAll() {
        return userList;
    }

    public void add(User user) {
        userList.add(user);
    }
}
