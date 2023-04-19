//package com.example.ut.entity;
//
//import com.example.ut.service.UserService;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.powermock.modules.junit4.PowerMockRunner;
//import org.powermock.reflect.Whitebox;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.util.ReflectionTestUtils;
//
///**
// * @description:
// * @author: zhaozhen
// * @create: 2023/03/01 13:17
// */
//@RunWith(PowerMockRunner.class)
//public class UserServiceReflectTest {
////    @Autowired
////    private UserService userService;
//
//    @InjectMocks
//    private UserService userService;
//
//    @Test
//    public void  testGetUserLimit(){
//        Long expected =1000L;
//        Whitebox.setInternalState(userService,"userLimit",expected);
//        Long actual =userService.getUserLimit();
//        Assert.assertEquals("返回值不相等",actual,expected);
//    }
//
//    @Test
//    public void  testGetUserLimitSetField(){
//        Long expected =1000L;
//        ReflectionTestUtils.setField(userService,"userLimit",expected);
//        Long actual =userService.getUserLimit();
//        Assert.assertEquals("返回值不相等",actual,expected);
//    }
//}
