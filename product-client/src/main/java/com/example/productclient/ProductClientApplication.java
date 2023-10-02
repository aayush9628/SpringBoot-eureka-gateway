package com.example.productclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@ComponentScan({"com.example.controller", "com.example.service"})
@EntityScan("com.example.entity")
@EnableJpaRepositories("com.example.repository")
@EnableFeignClients("com.example.feignclients")
public class ProductClientApplication {
	
	@Value("${order.service.url}")
	private String orderServiceUrl;

	public static void main(String[] args) {
		SpringApplication.run(ProductClientApplication.class, args);
	}
	
	@Bean
	public WebClient webClient () {
		WebClient webClient = WebClient.builder()
				.baseUrl(orderServiceUrl).build();
		
		return webClient;
	}

}
