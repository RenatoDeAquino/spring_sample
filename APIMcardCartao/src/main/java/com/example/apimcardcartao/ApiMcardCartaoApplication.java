package com.example.apimcardcartao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ApiMcardCartaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiMcardCartaoApplication.class, args);
	}

	@GetMapping("/")
	public  String index(){
		return "Olá mundo";
	}
}
