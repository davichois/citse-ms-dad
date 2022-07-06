package com.participante.citse.controller;

import com.participante.citse.entity.Respuesta;
import com.participante.citse.service.RespuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("respuesta")
public class RespuestaController {

    @Autowired
    private RespuestaService service;

    @GetMapping
    public List<Respuesta> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Respuesta findById(@PathVariable Integer id){
        return service.findById(id);
    }

    @PostMapping
    public Respuesta save(@RequestBody Respuesta respuesta){
        return service.save(respuesta);
    }

    @DeleteMapping
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }
}
