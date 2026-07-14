package com.unaempresa.primerproyecto.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.random.RandomGenerator;

public class Images {
	private static List<Image> listaImages = List.of(
			new Image("/img/washington.avif", "Washington"),
			new Image("/img/tehran.avif", "Tehran"),
			new Image("/img/wellington.avif", "Wellington"),
			new Image("/img/baku.avif", "Baku"),
			new Image("/img/warsaw.avif", "Warsaw"),
			new Image("/img/kyiv.avif", "Kyiv"),
			new Image("/img/London.avif", "London"),
			new Image("/img/madrid.avif", "Madrid"),
			new Image("/img/tirana.avif", "Tirana"),
			new Image("/img/rome.avif", "Rome")
		);
	
	public static List<Image> dameTodosLosImages() {
    	return listaImages;
    }
	
	public static Image dameImageAleatorio() {
    	return listaImages.get(RandomGenerator.getDefault().nextInt(listaImages.size()));
    }

	public static List<String> dameOpciones(Image correcta) {
		List<Image> resto = new ArrayList<>(listaImages);
		resto.remove(correcta);
		Collections.shuffle(resto);

		List<String> opciones = new ArrayList<>();
		opciones.add(correcta.getCapitalName());
		for (int i = 0; i < 3 && i < resto.size(); i++) {
			opciones.add(resto.get(i).getCapitalName());
		}
		Collections.shuffle(opciones);

		return opciones;
	}

}
