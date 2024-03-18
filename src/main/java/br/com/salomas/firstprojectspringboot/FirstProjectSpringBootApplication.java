package br.com.salomas.firstprojectspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.salomas")
public class FirstProjectSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectSpringBootApplication.class, args);
	}

}
