package com.example.ut.entity;

import java.util.Objects;

/**
 * @description: test
 * @author: zhaozhen
 * @create: 2023/02/18 09:16
 */
public class UserService {

    private Long superUserId;

    public boolean isNotSuperUser(Long userId){
        return !isSuperUserId(userId);
    }

    private boolean isSuperUsers(Long userId){
        return false;
    }

    public boolean isNotSuperUsers(Long userId){
        return isSuperUsers(userId);
    }
    public boolean isSuperUserId(Long userId){
        return Objects.equals(userId,superUserId);
    }
}
