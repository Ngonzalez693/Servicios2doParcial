package com.gonzalez.curso.repository;

import org.springframework.data.repository.CrudRepository;

import com.gonzalez.curso.models.entity.Curso;

public interface CursoRepository extends CrudRepository<Curso,Long>{

}