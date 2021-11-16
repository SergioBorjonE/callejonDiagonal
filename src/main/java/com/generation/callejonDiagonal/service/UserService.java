package com.generation.callejonDiagonal.service;

import com.generation.callejonDiagonal.model.User;

import java.util.ArrayList;

public interface UserService {
    User getUser(Integer id);

    User saveUser(User user);

    void delete(Integer id);

    ArrayList<User> findByEmail(String email);


}
