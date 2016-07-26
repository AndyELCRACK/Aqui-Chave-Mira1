package com.biblioteca.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.biblioteca.conexon.PostGresDB;
import com.biblioteca.dominio.Estudiante;

public class EstudianteRepositoryPostGreSQL implements EstudianteRepository{

	@Override
	public void ingresar(Estudiante estudiante) {
		try{
			Connection cnn=PostGresDB.Open();
			PreparedStatement stm=cnn.prepareStatement("INSERT INTO estudiante"
					+ "( estudianteid, identificacion, nombres, apellidos)VALUES (?, ?, ?, ?)");
			stm.setInt(1, estudiante.getEstudianteId());
			stm.setString(2, estudiante.getIdentificacion());
			stm.setString(3, estudiante.getNombres());
			stm.setString(4, estudiante.getApellidos());
			
			stm.execute();
			stm.close();
			cnn.close();
			System.out.println("Estudiante  ingresado con exito  ");
		}catch(SQLException e){
		    System.out.println("Error al ingresar Estudiante "+e);
			e.printStackTrace();
		}
	}

	@Override
	public Estudiante getEstudiante(int estudianteId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estudiante getEstudianteByIdentificacion(String identificacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Estudiante> getEstudiantesByNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Estudiante> getEstudiantes() {
		// TODO Auto-generated method stub
		return null;
	}

}
