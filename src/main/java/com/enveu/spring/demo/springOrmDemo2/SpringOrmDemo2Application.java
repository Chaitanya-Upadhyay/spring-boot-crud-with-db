package com.enveu.spring.demo.springOrmDemo2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringOrmDemo2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringOrmDemo2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello Spring World");
	}
}
