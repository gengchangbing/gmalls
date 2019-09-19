package com.atguigu.gmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.atguigu.gmall")
public class GmallManageWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmallManageWebApplication.class, args);
	}

}
