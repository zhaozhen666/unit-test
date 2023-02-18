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
 * @create: 2023/02/16 15:35
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({StringUtils.class})
public class StrUtilsTest {

    @Test
    public void testIsEmpty(){
        String str ="abc";
        boolean expected =true;
        PowerMockito.mockStatic(StringUtils.class);
        PowerMockito.when(StringUtils.isEmpty(str)).thenReturn(expected);
        boolean actual = StringUtils.isEmpty(str);
        Assert.assertEquals("返回值不相等",expected,actual);
    }

    @Test
    public  void testIsNotEmpty(){
        String str = null;
        boolean expected =true;
        PowerMockito.spy(StringUtils.class);
        PowerMockito.when(StringUtils.isEmpty(str)).thenReturn(!expected);
        boolean actual = StringUtils.isNotEmpty(str);
        System.out.println(expected);
        System.out.println(actual);
        Assert.assertEquals("返回值不相等",expected,actual);

    }
}
