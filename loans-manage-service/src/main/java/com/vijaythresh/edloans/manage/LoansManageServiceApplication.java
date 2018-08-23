package com.vijaythresh.edloans.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.vijaythresh.edloans")
public class LoansManageServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansManageServiceApplication.class, args);
	}
}
