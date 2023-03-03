package com.example.ut.entity;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * @description: test
 * @author: zhaozhen
 * @create: 2023/02/18 09:18
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({UserService.class})
public class UserServiceTest {
    @Test
    public void testIsNotSuperUser(){
        Long userId =1L;
        boolean expected = false;
        UserService userService = PowerMockito.spy(new UserService());
        PowerMockito.when(userService.isSuperUserId(userId)).thenReturn(!expected);
        boolean actual = userService.isNotSuperUser(userId);
        Assert.assertEquals("",expected,actual);
    }

    @Test
    public void testPrivate() throws Exception{
        Long userId =1L;
        boolean expected= false;
        UserService userService = PowerMockito.spy(new UserService());
        PowerMockito.when(userService,"isSuperUsers",userId).thenReturn(!expected);
        boolean actual = userService.isNotSuperUsers(userId);
        Assert.assertEquals("返回值不相等",expected,actual);
    }

    @Test
    public void  testVerifyPrivate() throws Exception{
        Long userId =1L;
        boolean expected= false;
        UserService userService = PowerMockito.spy(new UserService());
        PowerMockito.when(userService,"isSuperUsers",userId).thenReturn(!expected);
        boolean actual = userService.isNotSuperUsers(userId);
        PowerMockito.verifyPrivate(userService).invoke("isSuperUsers",userId);
        Assert.assertEquals("返回值不相等",expected,actual);
    }
}
