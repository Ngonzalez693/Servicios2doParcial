package com.gonzalez.curso.service;

import org.springframework.stereotype.Service;

import com.gonzalez.common.usuario.models.entity.Curso;
import com.gonzalez.commons.service.CommonService;
import com.gonzalez.commons.service.CommonServiceImpl;
import com.gonzalez.curso.repository.CursoRepository;

@Service
public class CursoServiceImpl extends CommonServiceImpl<Curso,CursoRepository> implements CommonService<Curso>{

}
