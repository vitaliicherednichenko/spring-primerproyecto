package com.unaempresa.primerproyecto.model;

public class Libro {
	private int id;
	private String titulo;
	private String autor;
	private int ejemplares;
	private Genero genero;
	private static int nextId = 1;

	public Libro(String titulo, String autor, int ejemplares, Genero genero) {
		this.id = nextId++;
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.genero = genero;
	}

	public int getId() { return id; }
	public String getTitulo() { return titulo; }
	public String getAutor() { return autor; }
	public int getEjemplares() { return ejemplares; }
	public Genero getGenero() { return genero; }
}
