package com.biblioteca.dominio;

public class Estudiante {
private int estudianteId;
private String identificacion;
private String nombres;
private String apellidos;

public Estudiante(){}
public Estudiante(int estudianteId, String identificacion, String nombres,
		String apellidos) {
	super();
	this.estudianteId = estudianteId;
	this.identificacion = identificacion;
	this.nombres = nombres;
	this.apellidos = apellidos;
}

public int getEstudianteId() {
	return estudianteId;
}

public void setEstudianteId(int estudianteId) {
	this.estudianteId = estudianteId;
}

public String getIdentificacion() {
	return identificacion;
}

public void setIdentificacion(String identificacion) {
	this.identificacion = identificacion;
}

public String getNombres() {
	return nombres;
}

public void setNombres(String nombres) {
	this.nombres = nombres;
}

public String getApellidos() {
	return apellidos;
}

public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}


}
