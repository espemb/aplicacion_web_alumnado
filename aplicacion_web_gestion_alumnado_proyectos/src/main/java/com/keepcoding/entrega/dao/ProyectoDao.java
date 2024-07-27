package com.keepcoding.entrega.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.keepcoding.entrega.entity.Proyecto;

@Repository
public interface ProyectoDao extends CrudRepository<Proyecto, Long>{

}
