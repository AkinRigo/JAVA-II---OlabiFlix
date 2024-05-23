package com.olabi.olabiflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController

@SpringBootApplication
public class OlabiflixApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlabiflixApplication.class, args);
	}

}
	// http://localhost:8080/hello

	@GetMapping("/hello")
	public String hello (){
	 return "Salve,mundão";
	}
