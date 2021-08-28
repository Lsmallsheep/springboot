package com.luo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author ANGEL
 * @Date 2021/8/28 17:31
 */
@SpringBootApplication
public class RedisApplication {

    public static void main(String[] args) {

        SpringApplication.run(RedisApplication.class,args);
        System.out.println("RedisApplication 运行成功" +
                "---------------------------------------------------------------------------");

    }

}
