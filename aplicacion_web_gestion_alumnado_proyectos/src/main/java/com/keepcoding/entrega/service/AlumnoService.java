package com.keepcoding.entrega.service;

import java.util.List;

import com.keepcoding.entrega.entity.Alumno;

public interface AlumnoService {
	
	public List<Alumno> listarAlumnos();
	
	public Alumno guardarAlumno(Alumno alumno);
	
	public Alumno obtenerAlumnoPorId(Long id);
	
	public void eliminarAlumno(Long id);
	
}
