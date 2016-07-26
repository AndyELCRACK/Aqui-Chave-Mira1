package com.biblioteca.repository;

import java.util.List;

import com.biblioteca.dominio.Estudiante;

public interface EstudianteRepository {
	
void ingresar(Estudiante estudiante);
Estudiante getEstudiante(int estudianteId);
Estudiante getEstudianteByIdentificacion(String identificacion);
List<Estudiante> getEstudiantesByNombre(String nombre);
List<Estudiante> getEstudiantes();

}
