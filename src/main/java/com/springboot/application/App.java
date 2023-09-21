package com.springboot.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({ "com.springboot.controller", "com.springboot.service" })
@EnableJpaRepositories("com.springboot.dao")
@EntityScan(basePackages = { "com.springboot.entity" })
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		System.out.println("Hello World!.......");
	}
}
