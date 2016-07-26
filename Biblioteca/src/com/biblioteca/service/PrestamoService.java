package com.biblioteca.service;

import java.util.List;

import com.biblioteca.dominio.Prestamo;
import com.biblioteca.repository.LibroRepository;

public interface PrestamoService {

	void prestar(Prestamo prestamo);
	List<Prestamo> getPrestamoByCliente(String identificacion);
	LibroRepository getLibroRepository();
}
