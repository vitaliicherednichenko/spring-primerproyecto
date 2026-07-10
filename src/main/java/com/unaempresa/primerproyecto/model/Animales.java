package com.unaempresa.primerproyecto.model;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.random.RandomGenerator;

public class Animales {
	private static List<Animal> listaAnimales = List.of(
				new Animal("gato", "verde", 3.5),
				new Animal("perro", "marron", 10),
				new Animal("perro", "verde", 40.4),
				new Animal("oso", "blanco", 500)
			);
	
    public static Animal dameAnimalAleatorio() {
    	return listaAnimales.get(
    			RandomGenerator.getDefault().nextInt(listaAnimales.size())); 
    }

    public static List<Animal> dameAnimalesPorTipo(String tipo) {
    	List<Animal> listaResultado = new ArrayList<>();
    	if (tipo == null || "".equals(tipo)) return listaResultado;
    	for (Animal animal : listaAnimales) {
    		if(animal.getTipo().equalsIgnoreCase(tipo)) listaResultado.add(animal);
    	}
    	return listaResultado;
    	
    }

    public static List<Animal> dameTodosLosAnimales() {
    	return listaAnimales;
    }
    
    public static List<Animal> dameAnimalesPorTipoMayorQue(String tipo, double peso) {
        List<Animal> listaResultado = new ArrayList<>();
        if (tipo == null || "".equals(tipo)) return listaResultado;

        for (Animal animal : listaAnimales) {
            if (animal.getTipo().equalsIgnoreCase(tipo)
                    && animal.getPeso() > peso) {
                listaResultado.add(animal);
            }
        }

        return listaResultado;
    }
    
    public static Optional<Animal> dameAnimalPorId(int id) {
        for (Animal animal : listaAnimales) {
            if (animal.getId() == id) return Optional.of(animal);
        }
        return Optional.empty();
    }
    
}
