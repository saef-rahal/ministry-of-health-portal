package com.supply.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@SpringBootApplication
public class PortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortalApplication.class, args);
	}

}
