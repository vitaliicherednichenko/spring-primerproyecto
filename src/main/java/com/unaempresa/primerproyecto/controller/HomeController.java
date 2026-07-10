package com.unaempresa.primerproyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.unaempresa.primerproyecto.model.Homes;

@Controller
public class HomeController {

	@GetMapping({"/home","/", ""})
	public String home(Model model) {
		model.addAttribute("home", Homes.dameProverbioAleatorio());
		return "home/home";
	}
}
