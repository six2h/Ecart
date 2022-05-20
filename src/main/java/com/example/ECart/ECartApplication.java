package com.example.ECart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.ECart.*")
public class ECartApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECartApplication.class, args);
	}

}
