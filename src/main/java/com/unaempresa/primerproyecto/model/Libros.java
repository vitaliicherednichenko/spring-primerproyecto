package com.unaempresa.primerproyecto.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Libros {
	private static List<Libro> listaLibros = List.of(
			new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 12, Genero.NOVELA),
			new Libro("Cien años de soledad", "Gabriel García Márquez", 8, Genero.NOVELA),
			new Libro("La sombra del viento", "Carlos Ruiz Zafón", 14, Genero.NOVELA),
			new Libro("1984", "George Orwell", 15, Genero.CIENCIA_FICCION),
			new Libro("Un mundo feliz", "Aldous Huxley", 10, Genero.CIENCIA_FICCION),
			new Libro("Fahrenheit 451", "Ray Bradbury", 6, Genero.CIENCIA_FICCION),
			new Libro("El señor de los anillos", "J. R. R. Tolkien", 20, Genero.FANTASIA),
			new Libro("Harry Potter y la piedra filosofal", "J. K. Rowling", 30, Genero.FANTASIA),
			new Libro("Las crónicas de Narnia", "C. S. Lewis", 18, Genero.FANTASIA),
			new Libro("El hobbit", "J. R. R. Tolkien", 22, Genero.FANTASIA),
			new Libro("Veinte poemas de amor y una canción desesperada", "Pablo Neruda", 5, Genero.POESIA),
			new Libro("Rimas", "Gustavo Adolfo Bécquer", 4, Genero.POESIA),
			new Libro("Hojas de hierba", "Walt Whitman", 3, Genero.POESIA),
			new Libro("Sapiens", "Yuval Noah Harari", 14, Genero.HISTORIA),
			new Libro("Breve historia del mundo", "H. G. Wells", 7, Genero.HISTORIA),
			new Libro("Los pilares de la tierra", "Ken Follett", 9, Genero.HISTORIA),
			new Libro("El arte de la guerra", "Sun Tzu", 11, Genero.ENSAYO),
			new Libro("Meditaciones", "Marco Aurelio", 6, Genero.ENSAYO),
			new Libro("El príncipe", "Nicolás Maquiavelo", 8, Genero.ENSAYO),
			new Libro("Steve Jobs", "Walter Isaacson", 10, Genero.BIOGRAFIA),
			new Libro("El resplandor", "Stephen King", 13, Genero.TERROR),
			new Libro("Drácula", "Bram Stoker", 9, Genero.TERROR),
			new Libro("Frankenstein", "Mary Shelley", 7, Genero.TERROR),
			new Libro("Alicia en el país de las maravillas", "Lewis Carroll", 16, Genero.INFANTIL),
			new Libro("El principito", "Antoine de Saint-Exupéry", 25, Genero.INFANTIL)
		);

	public static List<Libro> dameTodosLosLibros() {
		return listaLibros;
	}
	
	public static Optional<Libro> dameLibroPorId(int id) {
        for (Libro libro : listaLibros) {
            if (libro.getId() == id) return Optional.of(libro);
        }
        return Optional.empty();
    }

	public static List<Libro> dameLibrosPorGenero(Genero genero) {
		List<Libro> listaResultado = new ArrayList<>();
		for (Libro libro : listaLibros) {
			if (libro.getGenero() == genero) listaResultado.add(libro);
		}
		return listaResultado;
	}

}
