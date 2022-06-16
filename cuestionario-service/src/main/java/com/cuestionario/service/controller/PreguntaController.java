package com.cuestionario.service.controller;

import com.cuestionario.service.serviceImp.PreguntaServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/preguntas")
public class PreguntaController {

    @Autowired
    private PreguntaServiceImp serviceImp;

    @GetMapping("/")
    public ResponseEntity<Map<String,Object>> findAll(){
        Map<String,Object> preguntas = new HashMap<>();
         return ResponseEntity.ok(preguntas);
    }
}
