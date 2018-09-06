package com.xiciwutong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: wutong
 * @date: 2018-8-26
 */
@SpringBootApplication
@MapperScan("com.xiciwutong.dao")
public class StartApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class);
    }
}
