package com.example.ut.entity;

/**
 * @description: test
 * @author: zhaozhen
 * @create: 2023/02/18 09:12
 */
public class StringUtils {

    public  static  boolean isNotEmpty(final  CharSequence cs){
        return !isEmpty(cs);
    }

    public static  boolean isEmpty(final  CharSequence cs ){
        return cs==null || cs.length()==0;
    }
}
