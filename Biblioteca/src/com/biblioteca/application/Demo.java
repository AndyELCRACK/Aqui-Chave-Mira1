package com.biblioteca.application;

import java.util.Date;

import com.biblioteca.dominio.Estudiante;
import com.biblioteca.dominio.Libro;
import com.biblioteca.dominio.Prestamo;
import com.biblioteca.repository.LibroRepository;
import com.biblioteca.repository.LibroRepositoryImpMemory;
import com.biblioteca.service.PrestamoService;
import com.biblioteca.service.PrestamoServiceImpMemory;

public class Demo {

	public static void main(String[] args) {

/*PrestamoService prestamoService=new PrestamoServiceImpMemory();
//LibroRepository libroRepository=new LibroRepositoryImpMemory();
LibroRepository libroRepository=prestamoService.getLibroRepository();

Libro libro=new Libro();
libro.setLibroId(5);

Estudiante estudiante=new Estudiante();
estudiante.setEstudianteId(1);

Prestamo prestamo=new Prestamo();
prestamo.setLibro(libro);
prestamo.setEstudiante(estudiante);
Date fechaPrestamo=new Date("1/1/2016");
prestamo.setFechaPrestamo(fechaPrestamo);

prestamoService.prestar(prestamo);

System.out.println(libroRepository.getLibro(5));
/*String arg1="Hola Mundo";
	String arg2="Hola Mundo";
	
	System.out.println(arg1==arg2);
	System.out.println(arg1.equals(arg2));
	System.out.println(arg1.contains(arg2));*/


	}

}
