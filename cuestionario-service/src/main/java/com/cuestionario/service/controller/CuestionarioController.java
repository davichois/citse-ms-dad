package com.cuestionario.service.controller;

import com.cuestionario.service.entity.Cuestionario;
import com.cuestionario.service.service.CuestionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cuestionario")
public class CuestionarioController {

    @Autowired
    private CuestionarioService cuestionarioService;


    @GetMapping("/")
    public ResponseEntity<List<Cuestionario>> findAll(){
        return ResponseEntity.ok().body(cuestionarioService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cuestionario> findById(@PathVariable int id){
        Cuestionario cuestionario = cuestionarioService.findById(id);

        if (cuestionario != null){
            return ResponseEntity.ok().body(cuestionarioService.findById(id));
        }else{
            return ResponseEntity.noContent().build();
        }
    }

}
