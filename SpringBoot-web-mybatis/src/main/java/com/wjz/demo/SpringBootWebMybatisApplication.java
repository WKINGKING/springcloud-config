package com.wjz.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(value="com.wjz.demo.mapper")
@SpringBootApplication
public class SpringBootWebMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebMybatisApplication.class, args);
	}

}
