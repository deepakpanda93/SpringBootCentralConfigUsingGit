package com.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ApplicationClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationClientApplication.class, args);
	}
}


@RestController
class Controller{
	
	@Value ("${message}")
	private String message;
	
	@Value ("${course}")
	private String course;
	
	@RequestMapping("/showMessage")
	private String showMessage(){
		return message;
	}
	
	@RequestMapping("/showCourse")
	private String showCourse(){
		return course;
	}
	
	
}