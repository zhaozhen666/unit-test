package com.example.ut.controller;

import com.example.ut.manager.MailManager;
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

    @PostMapping("testMail")
    public void testMail(){
        mailManager.sendEmail();
    }
}
