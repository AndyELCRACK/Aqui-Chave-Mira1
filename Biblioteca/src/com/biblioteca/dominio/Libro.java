package com.biblioteca.dominio;

public class Libro {
private int libroId;
private String isbn;
private String nombre;
private int existencia;

public Libro(){}
public Libro(int libroId, String isbn, String nombre, int existencia) {
	super();
	this.libroId = libroId;
	this.isbn = isbn;
	this.nombre = nombre;
	this.existencia = existencia;
}

public int getLibroId() {
	return libroId;
}

public void setLibroId(int libroId) {
	this.libroId = libroId;
}

public String getIsbn() {
	return isbn;
}

public void setIsbn(String isbn) {
	this.isbn = isbn;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getExistencia() {
	return existencia;
}
public void setExistencia(int existencia) {
	this.existencia = existencia;
}
@Override
public String toString() {
	return "Libro [libroId=" + libroId + ", isbn=" + isbn + ", nombre="
			+ nombre + ", existencia=" + existencia + "]";
}




}
