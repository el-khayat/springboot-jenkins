package com.example.demo;

import com.example.demo.dtos.RegisterRequest;
import com.example.demo.services.AuthenticationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import static com.example.demo.entites.Role.ADMIN;
import static com.example.demo.entites.Role.MANAGER;

//@EnableJpaAuditing(auditorAwareRef = "auditorAware")
@SpringBootApplication(scanBasePackages = "com.example.demo")

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			AuthenticationService service
	) {
		return args -> {
			System.out.println(" creating Admin : ===========######################") ;

			var admin = RegisterRequest.builder()
					.firstname("Admin")
					.lastname("Admin")
					.email("admin@mail.com")
					.password("password")
					.role(ADMIN)
					.build();

			System.out.println("Admin token: " + service.register(admin).getAccessToken());

		};
	}

}
