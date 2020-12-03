package com.supremepole.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class StartApplication {

	@RequestMapping("/")
	String helloWord(){
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}

}
