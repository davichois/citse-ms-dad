package com.negocio.service.controller;

import com.negocio.service.entity.ProyectoLugar;
import com.negocio.service.service.ProyectoLugarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proyecto_lugar")
public class PLController {

    @Autowired
    private ProyectoLugarService proyectoLugarService;


    @GetMapping("/")
    public ResponseEntity<List<ProyectoLugar>> findAll(){
        return ResponseEntity.ok().body(proyectoLugarService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProyectoLugar> findById(@PathVariable int id){
        ProyectoLugar PL = proyectoLugarService.findById(id);

        if(PL!=null){
            return  ResponseEntity.ok().body(proyectoLugarService.findById(id));
        }else{
            return ResponseEntity.noContent().build();
        }
    }

    @DeleteMapping
    public ResponseEntity<?> deleteById(@PathVariable int id){
        proyectoLugarService.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
