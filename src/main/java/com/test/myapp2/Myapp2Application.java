package com.test.myapp2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Myapp2Application {

	public static void main(String[] args) {
		SpringApplication.run(Myapp2Application.class, args);
	}

	@GetMapping("/message")
	public String getMessage() {
		return "MyApp #2";
	}
}
