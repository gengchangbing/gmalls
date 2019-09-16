package com.atguigu.gmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RequestMapping("com.atguigu.gmall.mapper")
public class GmallOrderWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmallOrderWebApplication.class, args);
	}

}
