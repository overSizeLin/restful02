package com.jiangfl.restful02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jiangfl.restful02.dao")
public class Restful02Application {

    public static void main(String[] args) {
        SpringApplication.run(Restful02Application.class, args);
    }
}
