package com.example.ut.entity;

import lombok.Data;
import lombok.ToString;

/**
 * @description: db
 * @author: zhaozhen
 * @create: 2023/03/06 13:11
 */
@Data
@ToString
public class UserDO {

    private Long uid;

    private String name;

    private String desc;

    private UserInfo userInfo;
}
