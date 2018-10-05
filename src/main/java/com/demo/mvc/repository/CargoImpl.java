package com.demo.mvc.repository;

import org.springframework.stereotype.Repository;

import com.demo.mvc.domain.Cargo;

@Repository
public class CargoImpl extends GenericRepository<Cargo, Long> implements CargoInterface {

}
