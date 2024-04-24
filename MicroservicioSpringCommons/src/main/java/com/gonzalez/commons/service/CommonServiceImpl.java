package com.gonzalez.commons.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public class CommonServiceImpl<E, R extends CrudRepository<E,Long>> implements CommonService<E>{

	@Autowired
	private R dao;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<E> findAll() {
		
		return dao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<E> findById(Long Id) {
		
		return dao.findById(Id);
	}

	@Override
	@Transactional
	public E save(E entity) {
		
		return dao.save(entity);
	}

	@Override
	@Transactional 
	public void deleteById(Long Id) {

		dao.deleteById(Id);
		
	}

}
