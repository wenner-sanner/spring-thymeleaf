package com.demo.mvc.repository;

import java.util.List;

import com.demo.mvc.domain.Funcionario;;

public interface FuncionarioInterface {

	public void save(Funcionario funcionario);
	
	public void update(Funcionario funcionario); 
	
	public void delete(Long id);
	
	public Funcionario findById(Long id); 
	
	public List<Funcionario> findAll(); 
}
