package com.example.ut.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.ut.entity.UserDO;

/**
 * @description: 数据库操作
 * @author: zhaozhen
 * @create: 2023/05/17 15:17
 */
public interface UserMapper extends BaseMapper<UserDO> {


    public  UserDO queryUserById(Long uid);
}
