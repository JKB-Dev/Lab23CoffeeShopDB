package com.coffeeDB.CoffeeShopDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.coffeeDB.CoffeeShopDB.dao.CoffeeShopDBItemDao;
import com.coffeeDB.CoffeeShopDB.dao.CoffeeShopDBUserDao;
import com.coffeeDB.CoffeeShopDB.entity.User;

@Controller
public class CoffeeShopDBController {
	
	
	@Autowired
	CoffeeShopDBItemDao itemDao;
	
	@Autowired
	CoffeeShopDBUserDao userDao;
	
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("products", itemDao.findAll());
		return mv;
	}
	
	@Autowired
	CoffeeShopDBUserDao dao;
	
	@RequestMapping("/addnewuser")
	public ModelAndView update(User user) {
		userDao.insertUser(user);
		ModelAndView mav = new ModelAndView("updateform");
		mav.addObject("user", user);
		return mav;
		
//		ModelAndView mv = new ModelAndView("updateform");
//		mv.addObject("cID", id);
//		mv.addObject("userName", name);
//		dao.insertUser(id, name);
//		//dao.insertUser(name); //taking out ID also means removing it from UserDao method
//		return mv;
	}
	
}
