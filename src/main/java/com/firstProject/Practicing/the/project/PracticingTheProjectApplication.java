package com.firstProject.Practicing.the.project;

import jakarta.persistence.EntityListeners;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PracticingTheProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticingTheProjectApplication.class, args);
	}

}
