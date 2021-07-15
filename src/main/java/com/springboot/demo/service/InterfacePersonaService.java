package com.springboot.demo.service;

import com.springboot.demo.entity.Persona;

import java.util.List;

public interface InterfacePersonaService {

    public List<Persona>listar();
    public Persona listarId(int id);
    public Persona save(Persona persona);
    public void delete(int id);
    public Persona update(Persona persona);
}
