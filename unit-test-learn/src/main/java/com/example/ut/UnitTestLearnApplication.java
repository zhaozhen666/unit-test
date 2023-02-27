package com.example.ut;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.ut.mapper")
public class UnitTestLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnitTestLearnApplication.class, args);
    }

}
