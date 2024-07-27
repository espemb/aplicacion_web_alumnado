package com.keepcoding.entrega.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.keepcoding.entrega.service.ProyectoService;

@Controller
public class ProyectoWebController {

	@Autowired
	private ProyectoService servicio;
	
	@GetMapping("/vistaproyectos")
	public String listarProyectos(Model modelo) {
		modelo.addAttribute("proyectos", servicio.buscarTodos());
	    return "proyecto";
	}
}
