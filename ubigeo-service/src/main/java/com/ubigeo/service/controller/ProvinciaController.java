package com.ubigeo.service.controller;

import com.ubigeo.service.entity.Provincia;
import com.ubigeo.service.service.ProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/provincia")
public class ProvinciaController {

    @Autowired
    private ProvinciaService provinciaService;


    @GetMapping("/")
    public ResponseEntity<List<Provincia>> findAll(){
        return ResponseEntity.ok().body(provinciaService.findAll());
    }

}
