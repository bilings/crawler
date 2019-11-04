package com.crawler;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.crawler.web.mapper") // mapper类路径扫描地址
@EnableTransactionManagement // 支持事务

public class ClawlerWebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClawlerWebappApplication.class, args);
	}

}

