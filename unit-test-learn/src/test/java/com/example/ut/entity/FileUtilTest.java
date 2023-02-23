package com.example.ut.entity;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.File;

/**
 * @description: 单元测试
 * @author: zhaozhen
 * @create: 2023/02/23 13:06
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({FileUtil.class})
public class FileUtilTest {

    @Test
    public void testIsFile() throws Exception{
        String fileName = "test.txt";
        File file = PowerMockito.mock(File.class);
        PowerMockito.whenNew(File.class).withArguments(fileName).thenReturn(file);
        PowerMockito.when(file.isFile()).thenReturn(true);
        Assert.assertTrue("返回值为假",FileUtil.isFile(fileName));
    }
}
