package com.negocio.service.controller;

import com.negocio.service.entity.EntidadProyecto;
import com.negocio.service.service.EntidadProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entidad_proyecto")
public class EPController {

    @Autowired
    private EntidadProyectoService entidadProyectoService;


    @GetMapping("/")
    public ResponseEntity<List<EntidadProyecto>> findAll(){
        return ResponseEntity.ok().body(entidadProyectoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EntidadProyecto> findById(@PathVariable int id){
        EntidadProyecto EP = entidadProyectoService.findById(id);
        if(EP!=null){
            return ResponseEntity.ok().body(entidadProyectoService.findById(id));
        }else{
            return ResponseEntity.noContent().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable int id){
        entidadProyectoService.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
