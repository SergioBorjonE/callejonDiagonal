package com.generation.callejonDiagonal.repository;

import com.generation.callejonDiagonal.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface UserRepository
    extends CrudRepository <User, Integer> {
    //El método busca por nombre
    ArrayList<User> findByName(String nombre);
}