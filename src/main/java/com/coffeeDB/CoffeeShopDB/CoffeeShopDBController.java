package com.coffeeDB.CoffeeShopDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.coffeeDB.CoffeeShopDB.dao.CoffeeShopDBDao;



@Controller
public class CoffeeShopDBController {
	@Autowired
	CoffeeShopDBDao dao;
	
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index", "users", dao.findAll());
	}
	
	@RequestMapping("/addnewuser")
	public ModelAndView addNew(@RequestParam("cID") int id, @RequestParam("userName") String name) {
		dao.insertUser(id, name);
				return new ModelAndView("index", "customers", dao.findAll());
	}
	
	
	@RequestMapping("/products")
	public ModelAndView products() {
		return new ModelAndView("items", "products", dao.findAll());
	}
	
	

}
