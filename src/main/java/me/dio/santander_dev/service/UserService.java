package me.dio.santander_dev.service;

import me.dio.santander_dev.model.User;

public interface UserService {
    
    User findById(long id);

    User create(User userToCreate);

    User deleteById(long id);
}
