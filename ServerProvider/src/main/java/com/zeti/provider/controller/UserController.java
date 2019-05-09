package com.zeti.provider.controller;

import com.zeti.provider.dao.UserDao;
import com.zeti.provider.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable Long id) {
        return this.userDao.findById(id);
    }
}
