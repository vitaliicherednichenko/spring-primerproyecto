package com.unaempresa.primerproyecto.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;
import com.unaempresa.primerproyecto.model.Loto;

@Service
public class LotosService {
	public static Loto generaCombinacion(int numeroMaximo, int cantidadNumeros, String pais) {
		List<Integer> bombo = new ArrayList<>();
		for (int numero = 1; numero <= numeroMaximo; numero++) {
			bombo.add(numero);
		}
		Collections.shuffle(bombo);

		List<Integer> numeros = new ArrayList<>(bombo.subList(0, cantidadNumeros));

		return new Loto(pais, numeroMaximo, cantidadNumeros, numeros);
	}

}
