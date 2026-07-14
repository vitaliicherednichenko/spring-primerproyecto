package com.unaempresa.primerproyecto.service;

import java.util.random.RandomGenerator;
import org.springframework.stereotype.Service;

@Service
public class ProverbioService {
	private String[] proverbios = {
			"Si te caes siete veces, levántate ocho.",
			"Un viaje de mil millas comienza con el primer paso.",
			"No tengas miedo de avanzar despacio, ten miedo de quedarte quieto.",
			"El agua hace flotar el barco, pero también puede hundirlo.",
			"Quien pregunta es un ignorante durante cinco minutos; quien no pregunta, lo será toda la vida.",
			"Si quieres felicidad durante una hora, toma una siesta. Si quieres felicidad durante un año, cásate. Si quieres felicidad para toda la vida, cultiva un jardín.",
			"El sabio no dice lo que sabe, el necio no sabe lo que dice.",
			"Las grandes almas tienen voluntades; las débiles tan solo deseos.",
			"Cava el pozo antes de tener sed.",
			"Si planeas para un año, siembra arroz. Si planeas para diez años, planta árboles. Si planeas para cien años, educa a las personas."
	};

    public String dameProverbioAleatorio() {
    	return proverbios[RandomGenerator.getDefault().nextInt(proverbios.length)];
    }

}
