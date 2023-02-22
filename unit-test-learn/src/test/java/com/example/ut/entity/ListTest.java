package com.example.ut.entity;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: list unit test
 * @author: zhaozhen
 * @create: 2023/02/16 14:42
 */
public class ListTest {
    @Test
    public void testSize(){
        Integer expected=100;
        List list = PowerMockito.mock(List.class);
        PowerMockito.when(list.size()).thenReturn(expected);
        Integer actual = list.size();
        System.out.println(expected);
        System.out.println(actual);
        Assert.assertEquals("返回值不相等",expected,actual);
    }


    @Test
    public void testGet(){
        int index = 0 ;
        Integer expected=100;
        List<Integer> mockList = PowerMockito.mock(List.class);
        PowerMockito.doReturn(expected).when(mockList).get(index);
        Integer actual = mockList.get(index);
        System.out.println(expected);
        System.out.println(actual);
        Assert.assertEquals("返回值不相等",expected,actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void  testException(){
        int index = -1 ;
        Integer expected=100;
        List<Integer> mockList = PowerMockito.mock(List.class);
        PowerMockito.doThrow(new IndexOutOfBoundsException()).when(mockList).get(index);
        Integer actual = mockList.get(index);
        Assert.assertEquals("返回值不相等",expected,actual);
    }

    @Test
    public void doAnswer(){
        int index = 1 ;
        Integer expected=100;
        List<Integer> mockList = PowerMockito.mock(List.class);
        PowerMockito.doAnswer(invocation->{
            Integer value = invocation.getArgument(0);
            System.out.println(value);
            return value*100;
        }).when(mockList).get(index);
        Integer actual = mockList.get(index);
        Assert.assertEquals("返回值不相等",expected,actual);

    }

    @Test
    public void testClear(){
        List<Integer> mockList = PowerMockito.mock(List.class);
        PowerMockito.doNothing().when(mockList).clear();
        mockList.clear();
        Mockito.verify(mockList).clear();
    }

    @Test
    public void  testReal(){
        int index =0 ;
        Integer expected =100;
        List<Integer> oldList = new ArrayList<>();
        oldList.add(expected);
        List<Integer> spyList = PowerMockito.spy(oldList);
        PowerMockito.doCallRealMethod().when(spyList).get(index);
        Integer actual = spyList.get(index);
        Assert.assertEquals("返回值不相等",expected,actual);
    }
}
