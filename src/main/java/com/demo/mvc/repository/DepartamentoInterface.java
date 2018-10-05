package com.demo.mvc.repository;

import java.util.List;

import com.demo.mvc.domain.Departamento;

public interface DepartamentoInterface {
	
	public void save(Departamento departamento);
	
	public void update(Departamento departamento); 
	
	public void delete(Long id);
	
	public Departamento findById(Long id); 
	
	public List<Departamento> findAll(); 
}
