package web.service;

import web.entity.User;

import java.util.List;

public interface UserService {
    List<User> userList();
    void add(User user);
    void delete(User user);
    void edit(User user);
    User getById(Long id);
}