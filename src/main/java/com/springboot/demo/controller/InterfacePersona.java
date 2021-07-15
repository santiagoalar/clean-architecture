package com.springboot.demo.controller;

import com.springboot.demo.entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterfacePersona extends CrudRepository <Persona, Integer> {
}
