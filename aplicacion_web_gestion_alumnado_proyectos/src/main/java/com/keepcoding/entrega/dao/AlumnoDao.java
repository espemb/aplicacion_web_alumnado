package com.keepcoding.entrega.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.keepcoding.entrega.entity.Alumno;

@Repository
public interface AlumnoDao extends CrudRepository<Alumno, Long> {

}
