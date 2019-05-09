package com.zeti.ribbon.controller;

import com.zeti.ribbon.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/move/{id}")
    public User findById(@PathVariable Long id) {
        //利用RestTemplate调用第三方服务
        User user = this.restTemplate.getForObject("http://spring-cloud-provider/user/{id}", User.class, id);
        return user;
    }
}
