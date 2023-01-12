package com.shoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.shoes.controller","com.shoes.service"})
@EntityScan("com.shoes.model")
@EnableJpaRepositories( "com.shoes.repository" )
public class ShoeLaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoeLaceApplication.class, args);
	}

}
