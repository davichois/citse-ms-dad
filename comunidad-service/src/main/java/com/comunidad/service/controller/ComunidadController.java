package com.comunidad.service.controller;

import com.comunidad.service.entity.Comunidad;
import com.comunidad.service.serviceImp.ComunidadServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comunidad")
public class ComunidadController {

    @Autowired
    private ComunidadServiceImp comunidadServiceImp;


    @GetMapping("/")
    public ResponseEntity<List<Comunidad>> findAll(){
        return ResponseEntity.ok().body(comunidadServiceImp.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Comunidad> findById(@PathVariable int id){
        Comunidad comunidad = comunidadServiceImp.findById(id);

        if (comunidad != null){
            return ResponseEntity.ok().body(comunidadServiceImp.findById(id));
        }else{
            return ResponseEntity.noContent().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable int id){
        comunidadServiceImp.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
