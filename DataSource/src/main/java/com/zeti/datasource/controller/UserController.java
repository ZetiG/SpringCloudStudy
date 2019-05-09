package com.zeti.datasource.controller;

import com.zeti.datasource.entity.User;
import com.zeti.datasource.mapper01.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userMapper.selectById(id);
    }
}
