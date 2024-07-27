package com.keepcoding.entrega.service;

import java.util.List;

import com.keepcoding.entrega.entity.Proyecto;

public interface ProyectoService {
	
	public List<Proyecto> buscarTodos();

	public Proyecto buscarPorId(Long id);

	public Proyecto guardar(Proyecto proyecto);

	public void borrar(Long id);
}
