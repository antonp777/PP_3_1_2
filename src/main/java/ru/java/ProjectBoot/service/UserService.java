package ru.java.ProjectBoot.service;



import ru.java.ProjectBoot.model.User;

import java.util.List;


public interface UserService {
    public List<User> showUsers();
    public User showUser(int id);

    public void saveUser(User user);

    public void updateUser(int id, User user);

    public void deleteUser(int id);
}
