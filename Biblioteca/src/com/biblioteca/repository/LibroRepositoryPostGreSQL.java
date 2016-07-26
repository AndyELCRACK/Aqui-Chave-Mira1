package com.biblioteca.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.biblioteca.conexon.PostGresDB;
import com.biblioteca.dominio.Libro;

public class LibroRepositoryPostGreSQL implements LibroRepository{
	private List<Libro> li=new ArrayList<Libro>();

	@Override
	public void ingreso(Libro libro) {
		
		try{
			Connection cnn=PostGresDB.Open();
			PreparedStatement stm=cnn.prepareStatement("INSERT INTO libro"
					+ "( libroId, isbn, nombre, existencia)VALUES (?, ?, ?, ?)");
			stm.setInt(1, libro.getLibroId());
			stm.setString(2, libro.getIsbn());
			stm.setString(3, libro.getNombre());
			stm.setInt(4, libro.getExistencia());
			
			stm.execute();
			stm.close();
			cnn.close();
			System.out.println("Libro  ingresado con exito  ");
		}catch(SQLException e){
		    System.out.println("Error al ingresar Libro "+e);
			e.printStackTrace();
		}
	}

	@Override
	public void actualizarExistencia(Libro libro) {
		
//update	from set	
	}

	@Override
	public Libro getLibro(int libroId) {
		
		
		
//select	where libroid=?	
		return null;
	}

	@Override
	public List<Libro> getLibros() {
				
try{
	Connection cnn=PostGresDB.Open();	
			Statement stm=cnn.createStatement();
			ResultSet rs=stm.executeQuery("select * from libro");
			while(rs.next()){
				Libro la=new Libro(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
			li.add(la);
			
			}
			rs.close();
			stm.close();
			cnn.close();
			}catch(SQLException e){
				System.out.println("Error al consultar libros");
			}
//select where isbn=?
		return li;
		//consultar todos
// select * from libros where nombre like %?%
		
	}

	@Override
	public Libro getISBN(String isbn) {
		Libro ll=new Libro();
		try{
			Connection cnn=PostGresDB.Open();
			Statement stm=cnn.createStatement();
			ResultSet rs=stm.executeQuery("select * from libro where isbn ilike '"+isbn+"';");
			while(rs.next()){
				Libro l=new Libro(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
			
			ll=l;
			}
			rs.close();
			stm.close();
			cnn.close();
			}catch(SQLException e){
				System.out.println("Error al consultar libro por isbn");
			}
//select where isbn=?
		return ll;
	}

	@Override
	public List<Libro> getLibroByNombre(String nombre) {
		try{
			Connection cnn=PostGresDB.Open();
			Statement stm=cnn.createStatement();
			ResultSet rs=stm.executeQuery("select * from libro where nombre ilike'"+nombre+"';");
			while(rs.next()){
				Libro l=new Libro(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
			li.add(l);
			}
			rs.close();
			stm.close();
			cnn.close();
			}catch(SQLException e){
				System.out.println("Error al consultar libro por nombre");
			}
		return li;
	}

}
