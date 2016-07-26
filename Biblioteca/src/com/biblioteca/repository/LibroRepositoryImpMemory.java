package com.biblioteca.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.biblioteca.dominio.Libro;

public class LibroRepositoryImpMemory implements LibroRepository{

	private List<Libro> libros=new ArrayList<Libro>();
	 public LibroRepositoryImpMemory() {
		/*libros.add(new Libro(1,"111111","Android Programing",2));
		libros.add(new Libro(2,"222222","Harry Potter",4));
		libros.add(new Libro(3,"333333","AngularJS Pro",1));
		libros.add(new Libro(4,"444444","Ionic Framwork 1.0",9));
		libros.add(new Libro(5,"555555","Ionic Framwork 2.0",1));*/
	}
	 
	@Override
	public void ingreso(Libro libro) {
		libros.add(libro);
		
	}

	@Override
	public Libro getLibro(int libroId) {
		for(Libro libro:libros){
			//if(libro.getLibroId()==libroId)
				return libro;
		}
		return null;
	}

	@Override
	public List<Libro> getLibros() {
		// TODO Auto-generated method stub
		return libros;
	}
	@Override
	public List<Libro> getLibroByNombre(String nombre) {
		//alternativa para los que no tienen java 8
				//List<Libro> result=new ArrayList<>();
				//for(Libro libro:libros){
				//	if(libro.getNombre().contains(nombre))
				//		result.add(libro);
				//}
				//return result;
		return libros.stream().filter(c->c.getNombre().contains(nombre))
		.collect(Collectors.toList());
		
	}
	@Override
	public Libro getISBN(String isbn) {
		for(Libro libro:libros){
			if(libro.getIsbn().equals(isbn))
				return libro;
		}
		return null;
	}

	@Override
	public void actualizarExistencia(Libro libro) {
/*Libro libroTemp=getLibro(libro.getLibroId());
libroTemp.setExistencia(libroTemp.getExistencia()-1);*/
	}

}
