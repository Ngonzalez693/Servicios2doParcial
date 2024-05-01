package com.gonzalez.usuario.service;

import com.gonzalez.commons.service.CommonService;
import com.gonzalez.usuario.entity.Alumno;

public interface AlumnoService extends CommonService<Alumno>{
	
	public Alumno save(Alumno alumno);
	
	public void deleteById (Long Id);
}
