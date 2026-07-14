package com.unaempresa.primerproyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.unaempresa.primerproyecto.model.Loto;
import com.unaempresa.primerproyecto.service.LotosService;

@Controller
@RequestMapping("/loto")
public class LotoController {
	@ModelAttribute(name = "titulo")
	public String titulo() {
		return "Loto";
	}
	
	@Autowired
	private LotosService lotosService;

	@GetMapping("/menu")
	public String menu() {
		return "loto/menu";
	}

	@GetMapping("/genera/{max}/{cantidad}/{pais}")
	public String genera(
			@PathVariable int max,
			@PathVariable int cantidad,
			@PathVariable String pais,
			Model model) {

		Loto loto = lotosService.generaCombinacion(max, cantidad, pais);
		model.addAttribute("loto", loto);
		return "loto/genera";
	}

}
