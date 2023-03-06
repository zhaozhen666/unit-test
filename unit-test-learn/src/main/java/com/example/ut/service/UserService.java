package com.example.ut.service;

import cn.hutool.core.bean.BeanUtil;
import com.example.ut.entity.UserDO;
import com.example.ut.entity.UserVO;
import com.example.ut.mapper.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    UserDao userDao;

    public void  modifyUser(UserVO userVO){
        UserDO userDO = new UserDO();
        BeanUtil.copyProperties(userVO,userDO);
        userDao.modify(userDO);
    }
}
