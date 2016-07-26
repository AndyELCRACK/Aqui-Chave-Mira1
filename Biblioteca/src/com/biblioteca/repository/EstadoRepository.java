package com.biblioteca.repository;

import java.util.List;

import com.biblioteca.dominio.Estado;

public interface EstadoRepository {
void ingreso(Estado estado);
Estado getEstado(int estadoId);
List<Estado> getEstados();
}
