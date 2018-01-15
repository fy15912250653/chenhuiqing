package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.demo.mapper")
//test
//nihao
public class ChenhuiqingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChenhuiqingApplication.class, args);
	}
}
