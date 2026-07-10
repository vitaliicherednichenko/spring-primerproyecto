package com.unaempresa.primerproyecto.model;

public class Animal {
	private int id;
	private String tipo;
	private String color;
	private double peso;
	private static int nextId = 1;
	
	public Animal(String tipo, String color, double d) {
		this.id = nextId++;
		this.tipo = tipo;
		this.color = color;
		this.peso = d;
	}
	
	public int getId() { return id; }
	public String getTipo() { return tipo; }
	public String getColor() { return color; }
	public double getPeso() { return peso; }
}
