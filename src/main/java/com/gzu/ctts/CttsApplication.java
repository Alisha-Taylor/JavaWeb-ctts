package com.gzu.ctts;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gzu.ctts.mapper") // 扫描mapper接口所在包
public class CttsApplication {
    public static void main(String[] args) {
        SpringApplication.run(CttsApplication.class, args);
    }
}
