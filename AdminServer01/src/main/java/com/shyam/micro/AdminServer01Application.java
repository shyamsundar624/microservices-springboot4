package com.shyam.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
/*
* Main by shyamsundar624
*
*/	
	
@SpringBootApplication
@EnableAdminServer
public class AdminServer01Application {

	public static void main(String[] args) {
		SpringApplication.run(AdminServer01Application.class, args);
	}

}
