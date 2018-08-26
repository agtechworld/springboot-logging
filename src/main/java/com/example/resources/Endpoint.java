package com.example.resources;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.example.service.Service;


@Component
@Path("/hello")
public class Endpoint {
	
	  Logger logger = LoggerFactory.getLogger(Endpoint.class);
			  
	@Autowired
	private Service service;

	@Value("${message.World}") 
	private String message;


	@GET
	@Path("/test")
	public String message() {
		logger.info("In the method GET");
		logger.debug("In the method GET DEBUG");
		return  service.getName();
	}

}