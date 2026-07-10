package com.unaempresa.primerproyecto.model;

import java.util.List;
import java.util.random.RandomGenerator;

public class Homes {
	private static List<Home> listaProverbios = List.of(
			new Home("Si te caes siete veces, levántate ocho."),
			new Home("Un viaje de mil millas comienza con el primer paso."),
			new Home("No tengas miedo de avanzar despacio, ten miedo de quedarte quieto."),
			new Home("El agua hace flotar el barco, pero también puede hundirlo."),
			new Home("Quien pregunta es un ignorante durante cinco minutos; quien no pregunta, lo será toda la vida."),
			new Home("Si quieres felicidad durante una hora, toma una siesta. Si quieres felicidad durante un año, cásate. Si quieres felicidad para toda la vida, cultiva un jardín."),
			new Home("El sabio no dice lo que sabe, el necio no sabe lo que dice."),
			new Home("Las grandes almas tienen voluntades; las débiles tan solo deseos."),
			new Home("Cava el pozo antes de tener sed."),
			new Home("Si planeas para un año, siembra arroz. Si planeas para diez años, planta árboles. Si planeas para cien años, educa a las personas.")
		);
	
	public static List<Home> dameTodosLoslistaHomes() {
    	return listaProverbios;
    }

    public static Home dameProverbioAleatorio() {
    	return listaProverbios.get(RandomGenerator.getDefault().nextInt(listaProverbios.size()));
    }

}
