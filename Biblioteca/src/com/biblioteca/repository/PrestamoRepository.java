package com.biblioteca.repository;

import java.util.List;

import com.biblioteca.dominio.Prestamo;

public interface PrestamoRepository {

	void prestar(Prestamo prestamo);
	List<Prestamo> getPrestamoByCliente(String identificacion);
	
}
