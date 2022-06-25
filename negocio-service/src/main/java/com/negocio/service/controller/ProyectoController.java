package com.negocio.service.controller;

import com.negocio.service.entity.Proyecto;
import com.negocio.service.service.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proyecto")
public class ProyectoController {

    @Autowired
    private ProyectoService proyectoService;


    @GetMapping("/")
    public ResponseEntity<List<Proyecto>> findAll(){
        return ResponseEntity.ok().body(proyectoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Proyecto> findById(@PathVariable int id){
        Proyecto proyecto = proyectoService.findById(id);

        if (proyecto != null){
            return ResponseEntity.ok().body(proyectoService.findById(id));
        }else{
            return ResponseEntity.noContent().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable int id){
        proyectoService.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
