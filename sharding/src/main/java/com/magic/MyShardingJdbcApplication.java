package com.magic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 读写分离demo
 * Created by magic on 2020/1/4.
 */
//@MapperScan(value = "com.magic.repository")
@SpringBootApplication
public class MyShardingJdbcApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyShardingJdbcApplication.class,args);
    }
}
