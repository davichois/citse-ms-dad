package com.cuestionario.citse.controller;

import com.cuestionario.citse.entity.Pregunta;
import com.cuestionario.citse.service.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pregunta")
public class PreguntaController {

    @Autowired
    private PreguntaService preguntaService;


    @GetMapping("/")
    public ResponseEntity<List<Pregunta>> findAll(){
        return ResponseEntity.ok().body(preguntaService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pregunta> findById(@PathVariable int id){
        Pregunta pregunta = preguntaService.findById(id);

        if (pregunta != null){
            return ResponseEntity.ok().body(preguntaService.findById(id));
        }else{
            return ResponseEntity.noContent().build();
        }
    }

}
