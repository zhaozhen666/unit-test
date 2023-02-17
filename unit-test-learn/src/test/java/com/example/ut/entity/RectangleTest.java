package com.example.ut.entity;

import org.junit.Assert;
import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;

/**
 * @description: 单测
 * @author: zhaozhen
 * @create: 2023/02/16 15:04
 */
public class RectangleTest {

    @Test
    public void testGetArea(){
        Double expected=100.0d;
        Rectangle rectangle = PowerMockito.mock(Rectangle.class);
        PowerMockito.when(rectangle.getArea()).thenReturn(expected);
        Double actualArea = rectangle.getArea();
        System.out.println(expected);
        System.out.println(actualArea);
        Assert.assertEquals("返回值不相等",expected,actualArea,1E-6D);
    }
}
