package com.unaempresa.primerproyecto.model;

import java.util.List;

public class Images {
	private static List<Image> listaImages = List.of(
			new Image("img/washington.avif", "Washington"),
			new Image("img/tehran.avif", "Tehran"),
			new Image("img/wellington.avif", "Wellington"),
			new Image("img/baku.avif", "Baku"),
			new Image("img/warsaw.avif", "Warsaw"),
			new Image("img/kyiv.avif", "Kyiv"),
			new Image("img/london.avif", "London"),
			new Image("img/madrid.avif", "Madrid"),
			new Image("img/tirana.avif", "Tirana"),
			new Image("img/rome.avif", "Rome")
		);
	
	public static List<Image> dameTodosLosImages() {
    	return listaImages;
    }

}
