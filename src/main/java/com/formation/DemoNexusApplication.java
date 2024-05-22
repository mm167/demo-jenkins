package com.formation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication 
@RestController
public class DemoNexusApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoNexusApplication.class, args);
	}

	// restcontroller
	// get
	@GetMapping("/hello")
    public String hello() {
		return "<b>Hello World v1</b>";
	}	

}
