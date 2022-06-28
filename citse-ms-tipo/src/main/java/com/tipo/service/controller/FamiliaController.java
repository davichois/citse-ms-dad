package com.tipo.service.controller;

import com.tipo.service.entity.Familia;
import com.tipo.service.service.FamiliaService;
import com.tipo.service.serviceImp.FamiliaServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/familia")
public class FamiliaController {

    @Autowired
    private FamiliaService familiaService;


    @GetMapping("/")
    public ResponseEntity<List<Familia>> findAll(){
        return ResponseEntity.ok().body(familiaService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Familia> findById(@PathVariable int id){
        Familia familia = familiaService.findById(id);

        if (familia != null){
            return ResponseEntity.ok().body(familiaService.findById(id));
        }else{
            return ResponseEntity.noContent().build();
        }
    }

}
