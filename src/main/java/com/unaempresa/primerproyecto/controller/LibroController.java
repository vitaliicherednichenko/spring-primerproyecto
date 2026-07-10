package com.unaempresa.primerproyecto.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.unaempresa.primerproyecto.model.Genero;
import com.unaempresa.primerproyecto.model.Libro;
import com.unaempresa.primerproyecto.model.Libros;

@Controller
@RequestMapping("/libros")
public class LibroController {
	@ModelAttribute(name = "titulo")
	public String titulo() {
		return "Libros";
	}

	@GetMapping("/menu")
	public String menu(Model model) {
		List<Libro> libros = Libros.dameTodosLosLibros();
		model.addAttribute("cabecera", "Listado de libros");
		model.addAttribute("libros", libros);
		return "libros/menu";
	}

	@GetMapping("/id/{id}")
	public String detalle(@PathVariable int id, Model model) {
		model.addAttribute("cabecera", "Detalle del libro");
		model.addAttribute("libro", Libros.dameLibroPorId(id).orElse(null));
		return "libros/detalle";
	}

	@GetMapping("/genero/{genero}")
	public String porGenero(@PathVariable Genero genero, Model model) {
		List<Libro> libros = Libros.dameLibrosPorGenero(genero);
		model.addAttribute("cabecera", "Libros del género: " + genero);
		model.addAttribute("libros", libros);
		return "libros/menu";
	}

}
