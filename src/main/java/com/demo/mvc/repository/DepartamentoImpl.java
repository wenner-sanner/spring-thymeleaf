package com.demo.mvc.repository;

import org.springframework.stereotype.Repository;

import com.demo.mvc.domain.Departamento;

@Repository
public class DepartamentoImpl extends GenericRepository<Departamento, Long> implements DepartamentoInterface{

}
