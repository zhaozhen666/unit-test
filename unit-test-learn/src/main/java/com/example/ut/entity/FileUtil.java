package com.example.ut.entity;

import java.io.File;

/**
 * @description: test
 * @author: zhaozhen
 * @create: 2023/02/23 13:04
 */
public final class FileUtil {
    public static boolean isFile(String fileName){
        return new File(fileName).isFile();
    }

}
