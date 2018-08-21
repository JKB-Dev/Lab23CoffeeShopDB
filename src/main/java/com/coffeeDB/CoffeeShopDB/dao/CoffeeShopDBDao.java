package com.coffeeDB.CoffeeShopDB.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.coffeeDB.CoffeeShopDB.entity.Users;


@Repository //talks to the database
public class CoffeeShopDBDao {
	
	// need to use JdbcTemplate to execute a query
		@Autowired	// use Spring to autowire it
		JdbcTemplate jdbcTemplate;
		
		public List<Users> findAll(){
			return jdbcTemplate.query("SELECT * from Users", new BeanPropertyRowMapper<Users>(Users.class));
		}
		
		public int insertUser(int id, String name) {
			String insertQuery = "INSERT INTO Users(user_id, user_name)"
					+ " values(?,?)";
				return jdbcTemplate.update(insertQuery, id, name);
		}

}
