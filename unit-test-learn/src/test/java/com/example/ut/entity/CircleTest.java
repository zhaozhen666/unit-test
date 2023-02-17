package com.example.ut.entity;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * @description:
 * @author: zhaozhen
 * @create: 2023/02/16 15:14
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({Circle.class})
public class CircleTest {

    @Test
    public void testGetArea(){
        double expected=3.14D;
        Circle circle = PowerMockito.mock(Circle.class);
        PowerMockito.when(circle.getArea()).thenReturn(expected);
        double actualArea = circle.getArea();
        Assert.assertEquals("返回值不相等",expected,actualArea,1E-6D);
    }
}
