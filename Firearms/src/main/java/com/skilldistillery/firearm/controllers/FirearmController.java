package com.skilldistillery.firearm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.firearm.data.FirearmDAO;
import com.skilldistillery.firearm.entities.Firearm;

@Controller
public class FirearmController {

	@Autowired
	private FirearmDAO dao;

	@RequestMapping(path = { "/", "home.do" })
	public String goToHome(Model model) {
		model.addAttribute("FirearmList", dao.findAll());
		return "home";
	}
	
	@RequestMapping(path = "getFirearm.do", method = RequestMethod.GET)
	public String getPlayer(Model model, String name) {
		Firearm firearm = dao.findbyName(name);
		if (!(firearm == null)) {

			if (firearm.getName() == null) {
				model.addAttribute("firearm", firearm);
				return "firearm";

			}

			else {

				model.addAttribute("firearm", firearm);
				return "firearm";
			}
		}
		
		else {
			model.addAttribute("result", "BANG, YOU GOT ME!!");
			return"firearm/result";		}

	}


	@RequestMapping(path = "listFirearm.do", method = RequestMethod.GET)
	public String listAllFirearm(Model model) {
		model.addAttribute("firearm", dao.findAll());
		return "firearm/listFirearms";
	}


	@RequestMapping(path = "createFirearm.do", method = RequestMethod.POST)
	public String createPLayer(Firearm firearm, Model model) {
		model.addAttribute("firearm", dao.createFirearm(firearm));
		return "firearm";
	}

	@RequestMapping(path = "updateFirearm.do", method = RequestMethod.POST)
	private String updateFirearm(String name, Model model, Firearm firearm) {
		dao.updateFirearm(name, firearm);
		model.addAttribute("firearm", firearm);

		return "firearm";
	}

	@RequestMapping(path = "deleteFirearm.do", method = RequestMethod.GET)
	public String deleteFirearm(@RequestParam("name") String name, Model model) {
		try {
			if (dao.deleteFirearm(name)) {
				model.addAttribute("result", "Firearm Deleted!");
			}
			
			else {
				model.addAttribute("result", "Firearm Not Found!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "firearm/result";
	}
}
