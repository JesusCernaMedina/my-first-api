package com.example.api;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.example.api.entitys.User;

@SpringBootApplication
public class MyFirstApiApplication implements CommandLineRunner {

	
	
	public static void main(String[] args) {
		SpringApplication.run(MyFirstApiApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		
	}

}
