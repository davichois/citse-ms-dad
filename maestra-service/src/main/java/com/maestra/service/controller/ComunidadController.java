package com.maestra.service.controller;

import com.maestra.service.entity.Comunidad;
import com.maestra.service.service.ComunidadService;
import com.maestra.service.serviceImp.ComunidadServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comunidad")
public class ComunidadController {

    @Autowired
    private ComunidadService ComunidadService;


    @GetMapping("/")
    public ResponseEntity<List<Comunidad>> findAll(){
        return ResponseEntity.ok().body(ComunidadService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Comunidad> findById(@PathVariable int id){
        Comunidad comunidad = ComunidadService.findById(id);

        if (comunidad != null){
            return ResponseEntity.ok().body(ComunidadService.findById(id));
        }else{
            return ResponseEntity.noContent().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable int id){
        ComunidadService.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
