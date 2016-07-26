package com.biblioteca.service;

import java.util.List;

import com.biblioteca.dominio.Prestamo;
import com.biblioteca.repository.LibroRepository;

public class PrestamoServicePostGreSQL implements PrestamoService{

	@Override
	public void prestar(Prestamo prestamo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Prestamo> getPrestamoByCliente(String identificacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LibroRepository getLibroRepository() {
		// TODO Auto-generated method stub
		return null;
	}

}
