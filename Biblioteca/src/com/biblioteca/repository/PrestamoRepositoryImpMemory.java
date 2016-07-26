package com.biblioteca.repository;

import java.util.ArrayList;
import java.util.List;

import com.biblioteca.dominio.Prestamo;

public class PrestamoRepositoryImpMemory implements PrestamoRepository{

	
	private List<Prestamo> prestamos=new ArrayList<>();
	
	@Override
	public void prestar(Prestamo prestamo) {
prestamos.add(prestamo);
		
	}

	@Override
	public List<Prestamo> getPrestamoByCliente(String identificacion) {
List<Prestamo> result=new ArrayList<>();
for(Prestamo prestamo:prestamos){
	if(prestamo.getEstudiante().getIdentificacion().equals(identificacion))
		result.add(prestamo);
}
		return result;
	}

}
