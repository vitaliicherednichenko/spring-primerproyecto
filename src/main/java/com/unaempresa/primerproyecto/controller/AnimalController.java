package com.unaempresa.primerproyecto.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.unaempresa.primerproyecto.model.Animales;
import com.unaempresa.primerproyecto.model.Animal;

@Controller
@RequestMapping("/animal")
public class AnimalController {
	@ModelAttribute(name = "titulo")
	public String titulo() {
		return "Animales";
	}
	
	@GetMapping("/mostrar-uno")
	public String mostrarAnimalAlegatorio(Model model) {
		Animal animalAleatorio = Animales.dameAnimalAleatorio();
		model.addAttribute("cabecera", "Mostrando la informacion de un animal alegatorio");
		model.addAttribute("animal", animalAleatorio);
		return "animal/mostrar-uno";
	}
	
	@GetMapping("/mostrar-lista")
	public String mostrarTodosLosAnimales(Model model) {
		List<Animal> todos = Animales.dameTodosLosAnimales();
		model.addAttribute("cabecera", "Listado de los animales");
		model.addAttribute("animales", todos);
		return "animal/mostrar-lista";
	}
	
	@GetMapping("/tipo/{tipo}")
	public String mostrarAnimalesPorTipo(@PathVariable String tipo, Model model) {
	    List<Animal> animalesFiltrados = Animales.dameAnimalesPorTipo(tipo);
	    model.addAttribute("cabecera", "Animales de tipo: " + tipo);
	    model.addAttribute("animales", animalesFiltrados);
	    return "animal/mostrar-lista";
	}
	
	@GetMapping("/{tipo}/mayorque/{peso}")
	public String mostrarAnimalesPorTipoMayorQue(
	        @PathVariable String tipo,
	        @PathVariable double peso,
	        Model model) {

	    List<Animal> animales = Animales.dameAnimalesPorTipoMayorQue(tipo, peso);

	    model.addAttribute(
	            "cabecera",
	            "Animales de tipo " + tipo + " con peso mayor que " + peso);

	    model.addAttribute("animales", animales);

	    return "animal/mostrar-lista";
	}
	
	@GetMapping("/id/{id}")
	public String m(@PathVariable int id, Model model) {
	    model.addAttribute("cabecera", "Mostrando la informacion de un animal con Id " + id);
	    model.addAttribute("animal", Animales.dameAnimalPorId(id).orElse(null));
	    return "animal/mostrar-uno";
	}

}
