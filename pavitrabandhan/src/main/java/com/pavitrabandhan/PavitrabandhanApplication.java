package com.pavitrabandhan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.pavitrabandhan.controller.ControllerClass;

@SpringBootApplication(scanBasePackages = { "com.paritrabandhan.service", "com.paritrabandhan.repositry",
		"com.paritrabandhan.modal" })
@ComponentScan(basePackages = { "com.paritrabandhan.service", "com.paritrabandhan.repositry",
		"com.paritrabandhan.modal" },basePackageClasses = ControllerClass.class)
@EnableJpaRepositories("com.paritrabandhan.repositry")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PavitrabandhanApplication {

	public static void main(String[] args) {
		SpringApplication.run(PavitrabandhanApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/greeting-javaconfig").allowedOrigins("/*");
			}
		};
	}
}
