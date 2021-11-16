package com.generation.callejonDiagonal.controller;

import com.generation.callejonDiagonal.model.User;
import com.generation.callejonDiagonal.service.UserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserController(UserService userService, BCryptPasswordEncoder bCryptPasswordEncoder){
        this.userService = userService;
        this.bCryptPasswordEncoder=bCryptPasswordEncoder;
    }

    @PostMapping
    public User saveUsuario(@RequestBody User usuario) {
        usuario.setPassword(bCryptPasswordEncoder.encode(usuario.getPassword()));
        return userService.saveUser(usuario);
    }

    @GetMapping("/{id}")
    public User getUsuario(@PathVariable Integer id) {

        return userService.getUser(id);
    }

}
