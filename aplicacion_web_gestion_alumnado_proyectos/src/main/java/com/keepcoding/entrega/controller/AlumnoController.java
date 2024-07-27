package com.keepcoding.entrega.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.keepcoding.entrega.entity.Alumno;
import com.keepcoding.entrega.service.AlumnoService;

@Controller
public class AlumnoController {
	
	@Autowired
	private AlumnoService alumnoService;
	
	@GetMapping("/alumnos")
	public String listarAlumnos(Model modelo) {
		modelo.addAttribute("alumno", alumnoService.listarAlumnos());
		return "alumno";
	}
	
	@GetMapping("/alumnos/new")
	public String formularioAlumno(Model modelo) {
		Alumno alumno = new Alumno();
		modelo.addAttribute("alumno", alumno);
		return "crear_alumno";
	}
	
	@PostMapping("/alumnos/new")
	public String guardarAlumno(@ModelAttribute("alumno") Alumno alumno) {
		alumnoService.guardarAlumno(alumno);
		return "redirect:/alumnos";
	}
	
	@GetMapping("/alumno/edit/{id}")
	public String formularioEditarAlumno(@PathVariable Long id,Model modelo) {
		modelo.addAttribute("alumno",alumnoService.obtenerAlumnoPorId(id));
		return "editar_alumno";
	}
	
	@PostMapping("/alumno/edit/{id}")
	public String actualizarAlumno(@PathVariable Long id, @ModelAttribute("alumno") Alumno alumno) {
		Alumno alumnoUpdate = alumnoService.obtenerAlumnoPorId(id);
		
		alumnoUpdate.setNombre(alumno.getNombre());
		alumnoUpdate.setApellido(alumno.getApellido());
		alumnoUpdate.setEmail(alumno.getEmail());
		alumnoUpdate.setTelefono(alumno.getTelefono());
		alumnoUpdate.setDni(alumno.getDni());
		alumnoUpdate.setNacimiento(alumno.getNacimiento());
		
		alumnoService.guardarAlumno(alumnoUpdate);
		return "redirect:/alumnos";
	}
	
	@GetMapping("/alumno/eliminar/{id}")
	public String eliminarAlumno(@PathVariable Long id) {
		alumnoService.eliminarAlumno(id);
		return "redirect:/alumnos";
	}
}
