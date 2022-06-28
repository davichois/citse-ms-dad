package com.tipo.service.controller;

import com.tipo.service.entity.Tipo;
import com.tipo.service.service.TipoService;
import com.tipo.service.serviceImp.TipoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipo")
public class TipoController {

    @Autowired
    private TipoService tipoService;


    @GetMapping("/")
    public ResponseEntity<List<Tipo>> findAll(){
        return ResponseEntity.ok().body(tipoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tipo> findById(@PathVariable int id){
        Tipo tipo = tipoService.findById(id);

        if (tipo != null){
            return ResponseEntity.ok().body(tipoService.findById(id));
        }else{
            return ResponseEntity.noContent().build();
        }
    }

}
