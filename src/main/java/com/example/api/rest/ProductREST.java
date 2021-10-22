package com.example.api.rest;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.entitys.Product;
import com.example.api.entitys.User;

@RestController
@RequestMapping("/products")
public class ProductREST {
	
	@Autowired
	private JdbcTemplate jdbc;
	
	String sql = "SELECT NOMBRE FROM usuario WHERE ID = 6";
	
	@GetMapping("/user")
	public ResponseEntity<User> getProduct() {
		List<User> u = jdbc.query(sql, new RowMapper<User>() {

			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User u = new User(1, "chucho", 11);
				u.setNombre(rs.getString("NOMBRE"));
				System.out.println(u.getNombre());
				return u;
			}
			
		});
		return ResponseEntity.ok(u.get(0));
	}
	
//	@GetMapping // localhost:8080/ El metodo sera expuesto en la posicion marcada por el RequestMapping
	@RequestMapping(value="hello", method = RequestMethod.GET)
	public String hello() {
		return "Hello World";
	}

}
