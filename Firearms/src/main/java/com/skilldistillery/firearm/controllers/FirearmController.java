package com.skilldistillery.firearm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.firearm.data.FirearmDAO;


@Controller
public class FirearmController {
	
	@Autowired
	private FirearmDAO dao;
	
@RequestMapping(path = {"/", "home.do"})
	public String goToHome(Model model) {
	model.addAttribute("FirearmList", dao.findAll());
		return "home";
	}
	
}
