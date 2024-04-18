package com.gonzalez.usuario.service;

import java.util.Optional;

import com.gonzalez.usuario.entity.Alumno;

public interface AlumnoService {

	public Iterable<Alumno> findAll();
	
	public Optional<Alumno> findById(Long Id);
	
	public Alumno save(Alumno alumno);
	
	public void deleteById (Long Id);
}
