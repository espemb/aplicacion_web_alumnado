package com.keepcoding.entrega.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keepcoding.entrega.dao.AlumnoDao;
import com.keepcoding.entrega.entity.Alumno;


@Service
public class AlumnoServiceImpl implements AlumnoService {

	@Autowired
	private AlumnoDao alumnoDao;
	
	@Override
	public List<Alumno> listarAlumnos() {
		return (List<Alumno>) alumnoDao.findAll();
	}

	@Override
	public Alumno guardarAlumno(Alumno alumno) {
		return alumnoDao.save(alumno);
	}

	@Override
	public Alumno obtenerAlumnoPorId(Long id) {
		return alumnoDao.findById(id).get();
	}

	@Override
	public void eliminarAlumno(Long id) {
		alumnoDao.deleteById(id);		
	}

}
