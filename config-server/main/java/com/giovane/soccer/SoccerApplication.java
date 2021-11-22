package com.giovane.soccer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

// anotacao para executar o servidor em uma application Spring Boot
@EnableConfigServer
@SpringBootApplication
public class SoccerApplication {
	public static void main(String[] args) {
		SpringApplication.run(SoccerApplication.class, args);
	}
}
