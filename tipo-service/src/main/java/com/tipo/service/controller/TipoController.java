package com.tipo.service.controller;

import com.tipo.service.entity.Tipo;
import com.tipo.service.serviceImp.TipoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipo")
public class TipoController {

    @Autowired
    private TipoServiceImp tipoServiceImp;


    @GetMapping("/")
    public ResponseEntity<List<Tipo>> findAll(){
        return ResponseEntity.ok().body(tipoServiceImp.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tipo> findById(@PathVariable int id){
        Tipo tipo = tipoServiceImp.findById(id);

        if (tipo != null){
            return ResponseEntity.ok().body(tipoServiceImp.findById(id));
        }else{
            return ResponseEntity.noContent().build();
        }
    }

}
