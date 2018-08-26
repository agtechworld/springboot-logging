package com.example.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Service {
	
	private static  Logger logger = LoggerFactory.getLogger(Service.class);
	
	@Value("${name.value}")
	String name;
	int id;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		logger.info("In the method setName");
		logger.debug("In the method setName DEBUG");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}
