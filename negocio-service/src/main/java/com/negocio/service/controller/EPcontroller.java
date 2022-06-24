package com.negocio.service.controller;

import com.negocio.service.entity.Entidad_Proyecto;
import com.negocio.service.serviceImp.EPServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entidad_proyecto")
public class EPcontroller {

    @Autowired
    private EPServiceImp serviceImp;

    @GetMapping("/")
    public ResponseEntity<List<Entidad_Proyecto>> findAll(){
        return ResponseEntity.ok().body(serviceImp.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Entidad_Proyecto> findById(@PathVariable int id){
        Entidad_Proyecto EP = serviceImp.findById(id);
        if(EP!=null){
            return ResponseEntity.ok().body(serviceImp.findById(id));
        }else{
            return ResponseEntity.noContent().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable int id){
        serviceImp.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
