package com.generation.callejonDiagonal.service;

import com.generation.callejonDiagonal.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(Integer id) {
        return null;
    }

    @Override
    public User saveUser(User usuario) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public ArrayList<User> findByEmail(String email) {
        return null;
    }
}
