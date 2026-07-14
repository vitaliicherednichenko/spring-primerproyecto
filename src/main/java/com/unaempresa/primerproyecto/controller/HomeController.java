package com.unaempresa.primerproyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.unaempresa.primerproyecto.service.ProverbioService;

@Controller
public class HomeController {
	@ModelAttribute(name = "titulo")
	public String titulo() {
		return "Home";
	}

	@Autowired
	private ProverbioService proverbioService;

	@GetMapping({"/home","/", ""})
	public String home(Model model) {
		model.addAttribute("home", proverbioService.dameProverbioAleatorio());
		model.addAttribute("cabecera", "Home");
		return "home/home";
	}

}
