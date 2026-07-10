package com.unaempresa.primerproyecto.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.unaempresa.primerproyecto.model.Image;
import com.unaempresa.primerproyecto.model.Images;

@Controller
public class ImageController {
	@ModelAttribute(name = "titulo")
	public String titulo() {
		return "Images";
	}

	@GetMapping("/image")
	public String list(Model model) {
		List<Image> images = Images.dameTodosLosImages();
		model.addAttribute("cabecera", "Listado de Images");
		model.addAttribute("images", images);
		return "images/list";
	}

}
