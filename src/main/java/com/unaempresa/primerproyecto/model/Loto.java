package com.unaempresa.primerproyecto.model;

import java.util.List;

public class Loto {
	private String pais;
	private int numeroMaximo;
	private int cantidadNumeros;
	private List<Integer> numeros;

	public Loto(String pais, int numeroMaximo, int cantidadNumeros, List<Integer> numeros) {
		this.pais = pais;
		this.numeroMaximo = numeroMaximo;
		this.cantidadNumeros = cantidadNumeros;
		this.numeros = numeros;
	}

	public String getPais() { return pais; }
	public int getNumeroMaximo() { return numeroMaximo; }
	public int getCantidadNumeros() { return cantidadNumeros; }
	public List<Integer> getNumeros() { return numeros; }
}
