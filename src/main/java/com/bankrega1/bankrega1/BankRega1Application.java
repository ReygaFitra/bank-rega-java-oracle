package com.bankrega1.bankrega1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class BankRega1Application {

	public static void main(String[] args) {
		
		Dotenv dotenv = Dotenv.configure().load();

		String serverPort = dotenv.get("SERVER_PORT");
        String dataSourceUrl = dotenv.get("SPRING_DATASOURCE_URL");
        String dataSourceUsername = dotenv.get("SPRING_DATASOURCE_USERNAME");
        String dataSourcePassword = dotenv.get("SPRING_DATASOURCE_PASSWORD");
        String dataSourceDriverClassName = dotenv.get("SPRING_DATASOURCE_DRIVER-CLASS-NAME");
        String hibernateDdlAuto = dotenv.get("SPRING_JPA_HIBERNATE_DDL-AUTO");
        String showSql = dotenv.get("SPRING_JPA_SHOW-SQL");

		System.setProperty("server.port", serverPort);
        System.setProperty("spring.datasource.url", dataSourceUrl);
        System.setProperty("spring.datasource.username", dataSourceUsername);
        System.setProperty("spring.datasource.password", dataSourcePassword);
        System.setProperty("spring.datasource.driver-class-name", dataSourceDriverClassName);
        System.setProperty("spring.jpa.hibernate.ddl-auto", hibernateDdlAuto);
        System.setProperty("spring.jpa.show-sql", showSql);

		SpringApplication.run(BankRega1Application.class, args);
	}

}
