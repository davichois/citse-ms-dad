package com.negocio.service.controller;

import com.negocio.service.entity.Proyecto_Lugar;
import com.negocio.service.serviceImp.PLServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proyecto_lugar")
public class PLcontroller {

    @Autowired
    private PLServiceImp serviceImp;

    @GetMapping("/")
    public ResponseEntity<List<Proyecto_Lugar>> findAll(){
        return ResponseEntity.ok().body(serviceImp.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Proyecto_Lugar> findById(@PathVariable int id){
        Proyecto_Lugar PL = serviceImp.findById(id);

        if(PL!=null){
            return  ResponseEntity.ok().body(serviceImp.findById(id));
        }else{
            return ResponseEntity.noContent().build();
        }
    }

    @DeleteMapping
    public ResponseEntity<?> deleteById(@PathVariable int id){
        serviceImp.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
