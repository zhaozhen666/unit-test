package com.example.ut.entity;

import com.example.ut.mapper.UserDao;
import com.example.ut.service.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * @description: test case
 * @author: zhaozhen
 * @create: 2023/03/06 13:14
 */
@RunWith(PowerMockRunner.class)
public class UserServiceSpringTest {

    @Mock
    private UserDao userDao;

    @InjectMocks
    private UserService userService;

    @Captor
    private ArgumentCaptor<UserDO> argumentCaptor;

    @Before
    public void  beforeTest(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void  testCreateUser(){
        UserVO userVO = new UserVO();
        userVO.setId(1L);
        userVO.setName("xiaoming");
        userVO.setDesc("hao tongxue");
        userService.modifyUser(userVO);
        ArgumentCaptor<UserDO>  argumentCaptor = ArgumentCaptor.forClass(UserDO.class);
        Mockito.verify(userDao).modify(argumentCaptor.capture());

        UserDO userDO = argumentCaptor.getValue();
        Assert.assertNotNull("用户实例不为空",userDO);
        Assert.assertEquals("用户id不相等",userDO.getId(),userVO.getId());
    }

    @Test
    public void  testCreateUserArgumentCaptor(){
        UserVO userVO = new UserVO();
        userVO.setId(1L);
        userVO.setName("xiaoming");
        userVO.setDesc("hao tongxue");
        userService.modifyUser(userVO);
        Mockito.verify(userDao).modify(argumentCaptor.capture());
        UserDO userDO = argumentCaptor.getValue();
        Assert.assertNotNull("用户实例不为空",userDO);
        Assert.assertEquals("用户id不相等",userDO.getId(),userVO.getId());
    }

}
