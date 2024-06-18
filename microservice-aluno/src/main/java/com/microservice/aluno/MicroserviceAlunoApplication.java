package com.microservice.aluno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceAlunoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceAlunoApplication.class, args);
	}

}
