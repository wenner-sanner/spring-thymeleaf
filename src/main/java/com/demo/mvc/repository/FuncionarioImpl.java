package com.demo.mvc.repository;

import org.springframework.stereotype.Repository;

import com.demo.mvc.domain.Funcionario;

@Repository
public class FuncionarioImpl extends GenericRepository<Funcionario, Long> implements FuncionarioInterface {

}
