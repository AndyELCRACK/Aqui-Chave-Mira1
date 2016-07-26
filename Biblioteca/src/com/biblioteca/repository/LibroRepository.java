package com.biblioteca.repository;

import java.util.List;

import com.biblioteca.dominio.Libro;

public interface LibroRepository {
 void ingreso(Libro libro);
 void actualizarExistencia(Libro libro);
 
Libro getLibro(int libroId);
List<Libro> getLibros();
Libro getISBN(String isbn);
List<Libro> getLibroByNombre(String nombre);

}
