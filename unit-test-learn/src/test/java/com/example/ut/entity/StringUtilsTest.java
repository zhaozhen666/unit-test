package com.example.ut.entity;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * @description:
 * @author: zhaozhen
 * @create: 2023/02/24 12:26
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({StringUtils.class})
public class StringUtilsTest {

    @Test
    public void testStartWith(){
        String str ="abc";
        String prefix="b";
        boolean expected = true;
        PowerMockito.spy(StringUtils.class);
        PowerMockito.when(StringUtils.startsWith(Mockito.anyString(),Mockito.eq(prefix))).thenReturn(expected);
        boolean actual = StringUtils.startsWith(str,prefix);
        Assert.assertEquals("返回值不相等",expected,actual);
    }
}
