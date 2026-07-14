package com.unaempresa.primerproyecto.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

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

	@GetMapping({"/acertijo", "/acertijo/menu"})
	public String acertijoMenu(Model model) {
		Image imagen = Images.dameImageAleatorio();
		List<String> opciones = Images.dameOpciones(imagen);

		model.addAttribute("cabecera", "¿Qué ciudad es esta?");
		model.addAttribute("imagen", imagen);
		model.addAttribute("opciones", opciones);
		return "images/acertijo-menu";
	}

	@GetMapping("/acertijo/responder/{correcta}/{elegida}")
	public String acertijoResponder(
			@PathVariable String correcta,
			@PathVariable String elegida,
			Model model) {

		boolean acierto = correcta.equalsIgnoreCase(elegida);

		model.addAttribute("cabecera", acierto ? "¡Correcto!" : "Incorrecto");
		model.addAttribute("acierto", acierto);
		model.addAttribute("correcta", correcta);
		model.addAttribute("elegida", elegida);
		return "images/acertijo-resultado";
	}

}
