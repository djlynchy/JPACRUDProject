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

//home //
	@RequestMapping(path = { "/", "home.do" })
	public String goToHome(Model model) {

		return "home";
	}

//list firearms//
	@RequestMapping(path = "listFirearms.do", method = RequestMethod.GET)
	public String listAllFirearms(Model model) {
		model.addAttribute("firearm", dao.findAll());
		return "listFirearms";
	}
// creating firearm//

	@RequestMapping(path = "createFirearmForm.do", method = RequestMethod.GET)
	public String createFirearmForm(Firearm firearm) {

		return "newFirearm";
	}

	@RequestMapping(path = "createFirearm.do", method = RequestMethod.POST)
	public String createFirearm(Firearm firearm, Model model) {
		model.addAttribute("firearm", dao.createFirearm(firearm));
		return "showNewFirearm";
	}

	// deleting firearm//

	@RequestMapping(path = "deleteFirearm.do", method = RequestMethod.GET)
	public String deleteFirearm(@RequestParam("id") int id, Model model) {
		if (dao.deleteFirearm(id)) {
			model.addAttribute("result", "Bang! Firearm Deleted!");
		}

		else {
			model.addAttribute("result", "Firearm Not Found!");
		}
		return "result";
	}

//get firearm//
	
	@RequestMapping(path = "getFirearm.do", method = RequestMethod.GET)
	public String getFirearm(Model model, int id) {
		Firearm firearm = dao.findFirearmById(id);
		if (!(firearm == null)) {

			if (firearm.getName() == null) {
				model.addAttribute("firearm", firearm);
				return "showNewFirearm";

			}

			else {

				model.addAttribute("firearm", firearm);
				return "show";
			}
		}

		else {
			model.addAttribute("result", "Lost it in a boating accident!");
			return "result";
		}
	}
//updating firearm//
	@RequestMapping(path = "updateFirearmForm.do", method = RequestMethod.GET)
	public String updateFirearmForm(Firearm firearm, int id, Model model) {

		model.addAttribute("firearm", dao.findFirearmById(id));

		return "updateFirearm";
	}

	@RequestMapping(path = "updateFirearm.do", method = RequestMethod.POST)
	private String updateFirearm(int id, Model model, Firearm firearm, String name) {
		dao.updateFirearm(id, firearm);
		model.addAttribute("firearm", firearm);

		return "showNewFirearm";
	}
}