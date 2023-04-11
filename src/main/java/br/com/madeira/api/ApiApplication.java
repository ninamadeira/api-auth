package br.com.madeira.api;

import br.com.madeira.api.security.SecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		//System.out.println("Senha ==>"+ SecurityConfig.passwordEncoder().encode("123"));
		SpringApplication.run(ApiApplication.class, args);
	}

}
