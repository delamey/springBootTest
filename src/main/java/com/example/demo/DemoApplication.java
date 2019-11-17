package com.example.demo;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author xuyiming
 * @description
 * @date 2019-11-04 23:08
 */

@SpringBootApplication
@MapperScan("com.example.demo.dao.mapper")
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        //Person person = new Person.Builder().age(11).height(20d).weight(30d).name("delamey").build();
    }
}
