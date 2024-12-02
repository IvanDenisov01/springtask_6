package SpringApp.service;

import SpringApp.model.User;
import java.util.List;

public interface UserService {

    User getUserById(int id);

    void addUser(User user);

    void editUser(int id, User updatedUser);

    void deleteUser(int id);

    List<User> getAllUsers();

    void updateUser(int id, User updatedUser);
}



