package com.giovane.soccer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
// anotacao para executar o servidor em uma application Spring Boot
//@EnableConfigServer
public class SoccerApplication {
	public static void main(String[] args) {
		SpringApplication.run(SoccerApplication.class, args);
	}
}
