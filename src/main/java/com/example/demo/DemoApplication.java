package com.example.demo;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example")
@SpringBootApplication
public class DemoApplication {
	
//	  @Bean
//	  ResourceConfig resourceConfig() {
//	      return new ResourceConfig().register(Endpoint.class);
//	  }


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
