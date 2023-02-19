package com.example.ut.controller;

import com.example.ut.entity.Circle;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: test responsebody
 * @author: zhaozhen
 * @create: 2023/02/18 22:27
 */
@RestController
public class ResponseController {
    @PostMapping("test")
    public Circle testReturn(){
       Circle circle =  new Circle();
       circle.setRadius(5.0d);
        return circle;
    }

    @PostMapping("testString")
    public String testString(){

        return "test";
    }
}
