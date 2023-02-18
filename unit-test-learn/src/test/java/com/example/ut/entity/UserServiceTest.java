package com.example.ut.entity;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * @description: test
 * @author: zhaozhen
 * @create: 2023/02/18 09:18
 */
@RunWith(PowerMockRunner.class)
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
}
