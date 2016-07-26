package com.biblioteca.application;

import java.util.List;
import java.util.Scanner;

import com.biblioteca.dominio.Estado;
import com.biblioteca.dominio.Libro;
import com.biblioteca.repository.EstadoRepository;
import com.biblioteca.repository.EstadoRepositoyImpMemory;
import com.biblioteca.repository.EstudianteRepository;
import com.biblioteca.repository.EstudianteRepositoryPostGreSQL;
import com.biblioteca.repository.LibroRepository;
import com.biblioteca.repository.LibroRepositoryImpMemory;
import com.biblioteca.repository.LibroRepositoryPostGreSQL;

public class Main {

	public static void  opcionLibro(){
		LibroRepository libroRepository=new LibroRepositoryPostGreSQL();
		boolean entrar=true;
		int op=-1;
		while(op!=0){
			System.out.println("      MENU LIBROS");
			System.out.println("<1> Ingreso de libros");
			System.out.println("<2> Buscar libro por ISBN");
			System.out.println("<3> Buscar libro por nombre");
			System.out.println("<4> Mostrar todos los libros");
			System.out.println("<0> Salir");

			Scanner scanner=new Scanner(System.in);
			op=scanner.nextInt();
			switch(op){
			case 1:
				System.out.println("Ingreso id del libro");
				int LibroId=scanner.nextInt();
				System.out.println("Ingreso isbn del libro");
				String isbn=scanner.next();
				System.out.println("Ingreso nombre del libro");
				String nombre=scanner.next();
				System.out.println("Ingreso existencia del libro");
				int existencia=scanner.nextInt();
				Libro libro=new Libro(LibroId,isbn,nombre,existencia);
				libroRepository.ingreso(libro);
				
				

				break;
			case 2:
				System.out.println("Ingreso isbn para buscar el libro");
				String isbn2=scanner.next();
				Libro libro2=libroRepository.getISBN(isbn2);
				System.out.println(libro2);
				break;
			case 3:
				System.out.println("Ingreso nombre para buscar el libro");
				String nombre4=scanner.next();
				List<Libro> libros3=libroRepository.getLibroByNombre(nombre4);
				for(Libro libro3:libros3){
				System.out.println(libro3);
				}
				break;
			case 4:
				List<Libro> libros4=libroRepository.getLibros();
				for(Libro libro4:libros4){
					System.out.println(libro4);
				}
				break;
				
			}
			System.out.println("");
			System.out.println("¬(*-*)¬");
			System.out.println("");
		}

	}
private static void opcionEstudiante() {
	EstudianteRepository estudianteRepository=new EstudianteRepositoryPostGreSQL();	
	int op=-1;
	while(op!=0){
		System.out.println("      MENU ESTUDIANTES");
		System.out.println("<1> Ingreso de Estudiante");
		System.out.println("<2> Buscar libro por ISBN");
		System.out.println("<3> Buscar libro por nombre");
		System.out.println("<4> Mostrar todos los libros");
		System.out.println("<0> Salir");

		Scanner scanner=new Scanner(System.in);
		op=scanner.nextInt();
	}
	}

	public static void main(String[] args) {

int op=-1;
while(op!=0){
	System.out.println("<1> Libros");
	System.out.println("<2> Estudiante");
	System.out.println("<3> Prestamo");
	System.out.println("<4> Devoluciones");
	System.out.println("<0> Salir");
	Scanner scanner=new Scanner(System.in);
	op=scanner.nextInt();
	switch(op){
	case 1:
		opcionLibro();
		
		break;
	case 2:
		opcionEstudiante();
		break;
	
	}
	System.out.println("¬(*-*)¬");
	System.out.println("");

}
//EstadoRepository estadoRepository;
//estadoRepository=new EstadoRepositoyImpMemory();
//List<Libro> libros=libroRepository.getLibroByNombre("Ionic");
//System.out.println(libros);
/*Estado estado1=new Estado(3,"Devuelto con daños");
estadoRepository.ingreso(estado1);

List<Estado> estados=estadoRepository.getEstados();
for(Estado estado:estados){
	System.out.println(estado);
}*/

	}
	

}
