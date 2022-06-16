package com.negocio.service.controller;

import com.negocio.service.entity.Proyecto;
import com.negocio.service.serviceImp.ProyectoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proyecto")
public class ProyectoController {

    @Autowired
    private ProyectoServiceImp proyectoServiceImp;


    @GetMapping("/")
    public ResponseEntity<List<Proyecto>> findAll(){
        return ResponseEntity.ok().body(proyectoServiceImp.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Proyecto> findById(@PathVariable int id){
        Proyecto proyecto = proyectoServiceImp.findById(id);

        if (proyecto != null){
            return ResponseEntity.ok().body(proyectoServiceImp.findById(id));
        }else{
            return ResponseEntity.noContent().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable int id){
        proyectoServiceImp.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
