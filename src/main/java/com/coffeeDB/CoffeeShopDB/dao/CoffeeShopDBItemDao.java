package com.coffeeDB.CoffeeShopDB.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.coffeeDB.CoffeeShopDB.entity.Item;

@Repository //talks to the database
public class CoffeeShopDBItemDao {
	
	@Autowired 
	JdbcTemplate jdbcTemplate;
	
	
	public List<Item> findAll(){
		return jdbcTemplate.query("select * from items", new BeanPropertyRowMapper<Item>(Item.class));
	}
}
