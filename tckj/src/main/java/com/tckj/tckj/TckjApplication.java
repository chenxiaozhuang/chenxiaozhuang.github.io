package com.tckj.tckj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.tckj.tckj.user.dao")//扫描xml文件时，必须加入
public class TckjApplication {

    public static void main(String[] args) {
        SpringApplication.run(TckjApplication.class, args);
    }

}
