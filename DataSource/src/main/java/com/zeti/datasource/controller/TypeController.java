package com.zeti.datasource.controller;

import com.zeti.datasource.entity.Type;
import com.zeti.datasource.mapper02.TypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/type")
@RestController
public class TypeController {

    @Autowired
    private TypeMapper typeMapper;

    @GetMapping("/{id}")
    public Type getUser(@PathVariable Long id) {
        return typeMapper.selectById(id);
    }
}
