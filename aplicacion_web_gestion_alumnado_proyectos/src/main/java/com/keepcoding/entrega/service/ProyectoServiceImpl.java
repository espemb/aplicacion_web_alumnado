package com.keepcoding.entrega.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.keepcoding.entrega.dao.ProyectoDao;
import com.keepcoding.entrega.entity.Proyecto;

@Service
public class ProyectoServiceImpl implements ProyectoService{

	@Autowired
	private ProyectoDao proyectoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Proyecto> buscarTodos() {
		return (List<Proyecto>) proyectoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Proyecto buscarPorId(Long id) {
		return proyectoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Proyecto guardar(Proyecto proyecto) {
		return proyectoDao.save(proyecto);
	}

	@Override
	@Transactional
	public void borrar(Long id) {
		proyectoDao.deleteById(id);
	}

}
