package com.arun.urlShortener;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import io.swagger.v3.oas.models.info.License;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "ProductApi", version = "2.0", description = "URL Shortener"))
public class UrlShortenerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UrlShortenerApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	private static void doSomethingAfterStartup() {
		System.out.println("I'm Live at: "+ "http://localhost:8080/swagger-ui.html");
	}
}
