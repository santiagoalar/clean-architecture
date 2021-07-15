package com.springboot.demo.controller;

import com.springboot.demo.entity.Persona;
import com.springboot.demo.service.InterfacePersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class Controlador {

    @Autowired
    private InterfacePersonaService service;

    @GetMapping(value = "/list")
    public Iterable<Persona>list(){ return service.listar();}

    @GetMapping(value = "/list/{id}")
    public Persona get(@PathVariable("id") int id){ return service.listarId(id);}

    @PostMapping(value = "/save")
    public Persona save(@RequestBody Persona persona) { return service.save(persona);}

}
