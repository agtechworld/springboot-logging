package com.example.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.example.resources.Endpoint;


@Component
public class MyResourceConfig {
	
	@Bean
	
	ResourceConfig resourceConfig() {
	      return new ResourceConfig().register(Endpoint.class);
	  }
	

}
