package com.ubigeo.service.controller;

import com.ubigeo.service.entity.Departamento;
import com.ubigeo.service.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/departamento")
public class DepartamentoController {

    @Autowired
    private DepartamentoService departamentoService;


    @GetMapping("/")
    public ResponseEntity<List<Departamento>> findAll(){
        return ResponseEntity.ok().body(departamentoService.findAll());
    }

}
