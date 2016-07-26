package com.biblioteca.service;

import java.util.List;

import com.biblioteca.dominio.Libro;
import com.biblioteca.dominio.Prestamo;
import com.biblioteca.repository.LibroRepository;
import com.biblioteca.repository.LibroRepositoryImpMemory;
import com.biblioteca.repository.PrestamoRepository;
import com.biblioteca.repository.PrestamoRepositoryImpMemory;

public class PrestamoServiceImpMemory implements PrestamoService{

	private LibroRepository libroRepository=new LibroRepositoryImpMemory();
	private PrestamoRepository prestamosRepository=new PrestamoRepositoryImpMemory();
	
	@Override
	public void prestar(Prestamo prestamo) {

		Libro libro=prestamo.getLibro();
		Libro libroTemp=libroRepository.getLibro(libro.getLibroId());
		if(libroTemp.getExistencia()>=1){
			prestamosRepository.prestar(prestamo);
			libroRepository.actualizarExistencia(libroTemp);
		}
	}

	@Override
	public List<Prestamo> getPrestamoByCliente(String identificacion) {
		// TODO Auto-generated method stub
		return prestamosRepository.getPrestamoByCliente(identificacion);
	}

	public LibroRepository getLibroRepository() {
		return libroRepository;
	}

	

}
