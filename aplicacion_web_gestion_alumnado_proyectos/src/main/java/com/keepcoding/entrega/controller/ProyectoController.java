package com.keepcoding.entrega.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keepcoding.entrega.entity.Proyecto;
import com.keepcoding.entrega.service.ProyectoService;


@RestController
@RequestMapping("/api")
public class ProyectoController {

	@Autowired
	private ProyectoService servicio;
	
	@GetMapping("/proyectos")
	public List<Proyecto> index(){
		return servicio.buscarTodos();
	}
	
	@GetMapping("/proyectos/{id}")
	public Proyecto show(@PathVariable Long id) {
		return servicio.buscarPorId(id);
	}
	
	
	@PostMapping("/proyectos")
	public Proyecto create(@RequestBody Proyecto proyecto) {
		return servicio.guardar(proyecto);
	}
	
	
	@PutMapping("/proyectos/{id}")
	public Proyecto update(@PathVariable Long id, @RequestBody Proyecto proyecto) {
		Proyecto proyectoUpdate = servicio.buscarPorId(id);
		proyectoUpdate.setNombre(proyecto.getNombre());
		proyectoUpdate.setDescripcion(proyecto.getDescripcion());
		proyectoUpdate.setInicio(proyecto.getInicio());
		proyectoUpdate.setFin(proyecto.getFin());
		proyectoUpdate.setActivo(proyecto.isActivo());
		return servicio.guardar(proyectoUpdate);
	}
	
	
	@DeleteMapping("/proyectos/{id}")
	public void delete(@PathVariable Long id) {
		servicio.borrar(id);
	}

}
