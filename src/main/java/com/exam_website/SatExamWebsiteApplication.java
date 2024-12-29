package com.exam_website;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SatExamWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SatExamWebsiteApplication.class, args);
	}

}
