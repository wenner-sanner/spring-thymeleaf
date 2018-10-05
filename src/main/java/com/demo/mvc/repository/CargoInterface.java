package com.demo.mvc.repository;

import java.util.List;

import com.demo.mvc.domain.Cargo;

public interface CargoInterface {
	
	public void save(Cargo cargo);
	
	public void update(Cargo cargo); 
	
	public void delete(Long id);
	
	public Cargo findById(Long id); 
	
	public List<Cargo> findAll(); 
	
}
