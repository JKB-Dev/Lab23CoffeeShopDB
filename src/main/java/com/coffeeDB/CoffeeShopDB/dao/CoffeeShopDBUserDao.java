package com.coffeeDB.CoffeeShopDB.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.coffeeDB.CoffeeShopDB.entity.User;

@Repository //talks to the database
public class CoffeeShopDBUserDao {
	
	// need to use JdbcTemplate to execute a query
	
		@Autowired	// use Spring to autowire it
		JdbcTemplate jdbcTemplate;
		
		
		public int insertUser(User user) {
			String insertQuery = "INSERT INTO Users(user_name)"
					+ " values(?)";
				return jdbcTemplate.update(insertQuery, user.getUser_name());
		}

		
}
