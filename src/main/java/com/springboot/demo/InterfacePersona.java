package com.springboot.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterfacePersona extends CrudRepository <Persona, Integer> {
}
