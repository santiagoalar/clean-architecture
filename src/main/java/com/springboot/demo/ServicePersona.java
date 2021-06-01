package com.springboot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicePersona implements InterfacePersonaService{

    @Autowired
    private InterfacePersona data;

    @Override
    public List<Persona> listar() {
        return (List<Persona>) data.findAll();
    }

    @Override
    public Persona listarId(int id) {
        return data.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public Persona save(Persona persona) {
        return data.save(persona);
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Persona update(Persona persona) {
        return null;
    }
}
