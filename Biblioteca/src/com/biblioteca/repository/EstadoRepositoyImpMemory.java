package com.biblioteca.repository;

import java.util.ArrayList;
import java.util.List;

import com.biblioteca.dominio.Estado;

public class EstadoRepositoyImpMemory implements EstadoRepository{
	private List<Estado> estados=new ArrayList<>();
	public EstadoRepositoyImpMemory(){
		estados.add(new Estado(1,"Prestado"));
		estados.add(new Estado(2,"Devuelto"));
	}
 
	@Override
	public void ingreso(Estado estado) {
	estados.add(estado);
		
	}

	@Override
	public Estado getEstado(int estadoId) {
		for(Estado estado:estados){
			if(estado.getEstadoId()==estadoId)
				return estado;
		}
		return null;
	}

	@Override
	public List<Estado> getEstados() {
		// TODO Auto-generated method stub
		return null;
	}

}
