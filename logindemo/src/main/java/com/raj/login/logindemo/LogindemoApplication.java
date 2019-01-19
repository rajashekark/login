package com.raj.login.logindemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("com.raj.login.logidemo.model")
@EnableJpaRepositories("com.raj.login.logindemo.repository")
@SpringBootApplication
public class LogindemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogindemoApplication.class, args);
	}

}

