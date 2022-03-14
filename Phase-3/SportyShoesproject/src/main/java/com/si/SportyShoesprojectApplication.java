package com.si;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.si")
public class SportyShoesprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportyShoesprojectApplication.class, args);
	}

}
