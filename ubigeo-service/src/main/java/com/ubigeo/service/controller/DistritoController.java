package com.ubigeo.service.controller;

import com.ubigeo.service.entity.Distrito;
import com.ubigeo.service.service.DistritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/distrito")
public class DistritoController {

    @Autowired
    private DistritoService distritoService;


    @GetMapping("/")
    public ResponseEntity<List<Distrito>> findAll(){
        return ResponseEntity.ok().body(distritoService.findAll());
    }

}
