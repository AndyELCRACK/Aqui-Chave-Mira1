package com.biblioteca.repository;

import java.util.ArrayList;
import java.util.List;

import com.biblioteca.dominio.Estudiante;

public class EstudianteRepositoryImpMemory implements EstudianteRepository {

	private List<Estudiante> estudiantes=new ArrayList<>();
	public EstudianteRepositoryImpMemory(){
		estudiantes.add(new Estudiante(1,"11111","Jonathan","Guato"));
		estudiantes.add(new Estudiante(2,"22222","Andy","Carrillo"));
	}
	@Override
	public void ingresar(Estudiante estudiante) {
		estudiantes.add(estudiante);
	}

	@Override
	public Estudiante getEstudiante(int estudianteId) {
		for(Estudiante estudiante:estudiantes){
			if(estudiante.getEstudianteId()==estudianteId)
				return estudiante;
		}
		return null;
	}

	@Override
	public Estudiante getEstudianteByIdentificacion(String identificacion) {
		for(Estudiante estudiante:estudiantes){
			if(estudiante.getIdentificacion().equals(identificacion))
				return estudiante;
		}
		return null;
	}

	@Override
	public List<Estudiante> getEstudiantesByNombre(String nombre) {
		List<Estudiante> result=new ArrayList<Estudiante>();
		for(Estudiante estudiante:estudiantes){
			if(estudiante.getNombres().contains(nombre))
				result.add(estudiante);
				
		}
		return result;
	}

	@Override
	public List<Estudiante> getEstudiantes() {
		// TODO Auto-generated method stub
		return estudiantes;
	}

}
