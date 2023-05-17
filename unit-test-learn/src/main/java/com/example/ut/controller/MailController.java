package com.example.ut.controller;

import com.example.ut.entity.UserDO;
import com.example.ut.manager.MailManager;
import com.example.ut.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description: 邮件测试
 * @author: zhaozhen
 * @create: 2023/02/19 12:19
 */
@RestController
public class MailController {

    @Autowired
    MailManager mailManager;
    @Autowired
    UserMapper userMapper;

    @PostMapping("testMail")
    public void testMail(){
        mailManager.sendEmail();
    }


    @PostMapping("testAsa")
    public void testAsa(){
      UserDO userDO =  userMapper.queryUserById(1L);
      System.out.println(userDO);
    }

    @PostMapping("testCol")
    public void testCol(){
        UserDO userDO =  userMapper.queryUserInfosById(1L);
        System.out.println(userDO);
    }
}
