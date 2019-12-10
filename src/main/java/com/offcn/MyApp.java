package com.offcn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication // springBootApplication   由三个注解合并  @MapperScan,@EnableAutoConfiguration,@ComponentScan
@MapperScan("com.offcn.dao")
public class MyApp {

    public static void main(String[] args) {

        SpringApplication.run(MyApp.class,args);

    }


}
