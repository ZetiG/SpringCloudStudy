package com.zeti.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/mock")
@RestController
public class TestMockMvc {


    @GetMapping("/test")
    public String testMock(String param) {
        return "MockMvc测试成功!"+param;
    }
}
