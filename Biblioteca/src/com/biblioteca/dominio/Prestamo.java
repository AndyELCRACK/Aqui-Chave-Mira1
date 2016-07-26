package com.biblioteca.dominio;

import java.util.Date;

public class Prestamo {
private int prestamoId;
private Libro libro;
private Estudiante estudiante;
private Date fechaPrestamo;
private Estado estado;
private Date fechaDevolucion;
//1.Prestado
//2.Devuelto

public Prestamo(){}
public Prestamo(int prestamoId, Libro libro, Estudiante estudiante,
		Date fechaPrestamo, Estado estado, Date fechaDevolucion) {
	super();
	this.prestamoId = prestamoId;
	this.libro = libro;
	this.estudiante = estudiante;
	this.fechaPrestamo = fechaPrestamo;
	this.estado = estado;
	this.fechaDevolucion = fechaDevolucion;
}
public int getPrestamoId() {
	return prestamoId;
}
public void setPrestamoId(int prestamoId) {
	this.prestamoId = prestamoId;
}
public Libro getLibro() {
	return libro;
}
public void setLibro(Libro libro) {
	this.libro = libro;
}
public Estudiante getEstudiante() {
	return estudiante;
}
public void setEstudiante(Estudiante estudiante) {
	this.estudiante = estudiante;
}
public Date getFechaPrestamo() {
	return fechaPrestamo;
}
public void setFechaPrestamo(Date fechaPrestamo) {
	this.fechaPrestamo = fechaPrestamo;
}
public Estado getEstado() {
	return estado;
}
public void setEstado(Estado estado) {
	this.estado = estado;
}
public Date getFechaDevolucion() {
	return fechaDevolucion;
}
public void setFechaDevolucion(Date fechaDevolucion) {
	this.fechaDevolucion = fechaDevolucion;
}


}
