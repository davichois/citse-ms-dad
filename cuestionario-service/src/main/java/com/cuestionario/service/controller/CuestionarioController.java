package com.cuestionario.service.controller;

import com.cuestionario.service.repository.CuestionarioRepository;
import com.cuestionario.service.serviceImp.CuestionarioServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/cuestionarios")
public class CuestionarioController {

    @Autowired
    private CuestionarioServiceImp serviceImp;

    @GetMapping("/")
    public ResponseEntity<Map<String,Object>> findAll(){
        Map<String,Object> cuestionarios = new HashMap<>();
        return ResponseEntity.ok(cuestionarios);
    }
}
