package com.example.ut.entity;

/**
 * @description: 圆
 * @author: zhaozhen
 * @create: 2023/02/16 15:12
 */

public final class Circle {
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double radius;

    public double getArea(){
       return Math.PI*Math.pow(radius,2);
    }
}
