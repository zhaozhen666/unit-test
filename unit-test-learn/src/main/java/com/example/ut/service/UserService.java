package com.example.ut.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @description: testcase
 * @author: zhaozhen
 * @create: 2023/03/01 13:14
 */
@Service
public class UserService {

    @Value("${system.userLimit}")
    private Long userLimit;

    public Long getUserLimit(){
        return userLimit;
    }
}
