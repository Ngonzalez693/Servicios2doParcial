package com.gonzalez.usuario.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gonzalez.usuario.entity.Alumno;

@Repository
public interface AlumnoRepository extends CrudRepository<Alumno,Long>{

}
