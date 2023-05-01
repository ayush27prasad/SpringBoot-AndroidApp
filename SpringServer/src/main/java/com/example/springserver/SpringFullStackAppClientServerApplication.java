package com.example.springserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "com.example.springserver")
public class SpringFullStackAppClientServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFullStackAppClientServerApplication.class, args);
	}

}
