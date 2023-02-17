package com.example.ut.entity;

/**
 * @description: 形状
 * @author: zhaozhen
 * @create: 2023/02/16 14:54
 */
public interface Shape {
    default Double getArea(){
        return null;
    }
}
