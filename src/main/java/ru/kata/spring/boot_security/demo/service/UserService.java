package ru.kata.spring.boot_security.demo.service;

import org.springframework.stereotype.Component;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

@Component
public interface UserService {

    void saveUser(User user);

    User getByUserId(Long id);

    void update(User user);

    List<User> allUsers();

    void deleteUser(Long id);

    User findByUsername(String username);
}
