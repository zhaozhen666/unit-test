package com.example.ut.entity;

/**
 * @description: 长方形
 * @author: zhaozhen
 * @create: 2023/02/16 14:53
 */

public class Rectangle implements Shape {
    private Double width;
    private Double height;

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public Double getArea() {
        return width*height;
    }


}
