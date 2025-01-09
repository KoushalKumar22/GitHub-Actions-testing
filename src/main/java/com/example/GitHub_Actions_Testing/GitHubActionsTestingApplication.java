package com.example.GitHub_Actions_Testing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GitHubActionsTestingApplication {

	@GetMapping("/test")
	public String test(){
		return "This Is A Test Run";
	}

	public static void main(String[] args) {
		SpringApplication.run(GitHubActionsTestingApplication.class, args);
	}

}
