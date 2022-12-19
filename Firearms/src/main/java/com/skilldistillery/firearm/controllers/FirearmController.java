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
	FirearmDAO dao;

	@RequestMapping(path = { "/", "home.do" })
	public String goToHome(Model model) {
		model.addAttribute("FirearmList", dao.findAll());
		return "home";
	}

	@RequestMapping(path = "listFirearms.do", method = RequestMethod.GET)
	public String listAllFirearm(Model model) {
		model.addAttribute("firearm", dao.findAll());
		return "listFirearms";
	}

	@RequestMapping(path = "createFirearmForm.do", method = RequestMethod.GET)
	public String createFirearmForm(Firearm firearm) {

		return "newFirearm";
	}


	@RequestMapping(path = "deleteFirearm.do", method = RequestMethod.POST)
	public String deleteFirearm(@RequestParam("id")int id, Model model) {
		if (dao.deleteFirearm(id)) {
			model.addAttribute("result", "Firearm Deleted!");
		}

		else {
			model.addAttribute("result", "Firearm Not Found!");
		}
		return "result";
	}

	@RequestMapping(path = "createFirearm.do", method = RequestMethod.POST)
	public String createFirearm(Firearm firearm, Model model) {
		model.addAttribute("firearm", dao.createFirearm(firearm));
		return "showNewFirearm";
	}

	@RequestMapping(path = "getFirearm.do", method = RequestMethod.GET)
	public String getFirearm(Model model, String name) {
		String firearm = dao.findbyName(name);
		if (!(firearm == null )) {

				model.addAttribute("result", firearm);
				return "show";
			}
		

		else {
			model.addAttribute("result", "Firearm Not Found!");
			return "show";
		}
	}

	@RequestMapping(path = "updateFirearmForm.do", method = RequestMethod.POST)
	public String updateFirearmForm(String name, Model model) {
		try {
			model.addAttribute("name", dao.findbyName(name));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "updateFirearm";
	}

	@RequestMapping(path = "updateFirearm.do", method = RequestMethod.POST)
	private String updateFirearm(int id, Model model, Firearm firearm, String name) {
		dao.updateFirearm(id, firearm);
		model.addAttribute("firearm", firearm);

		return "showNewFirearm";
	}

}