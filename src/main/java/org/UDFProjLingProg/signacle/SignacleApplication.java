package org.UDFProjLingProg.signacle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SignacleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SignacleApplication.class, args);
	}

}
