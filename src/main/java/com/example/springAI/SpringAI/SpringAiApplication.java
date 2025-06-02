package com.example.springAI.SpringAI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SpringAiApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringAiApplication.class, args);
	}

}
