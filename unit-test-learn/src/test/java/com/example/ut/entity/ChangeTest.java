package com.example.ut.entity;

/**
 * @description: 引用类型与值类型变更
 * @author: zhaozhen
 * @create: 2023/05/08 09:36
 */
public class ChangeTest {

    public static void main(String[] args) {
      UserDO userDO =   new UserDO();
      userDO.setName("zhao");
      int i = 0;
      userDO.setDesc("zhen1");
      change(userDO.getName());
      changeInt(i);
      changeEntity(userDO);
      System.out.println(userDO.getName());
      System.out.println(i);
      System.out.println(userDO.getDesc());
    }

    public static void change(String name) {
        name = "zhen";
    }

    public static void changeEntity(UserDO userDO) {
        userDO.setDesc("zhen2");
    }

    public static void changeInt(int i) {
        i=2;
    }
}
