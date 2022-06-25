package com.negocio.service.controller;

import com.negocio.service.entity.Programa;
import com.negocio.service.service.ProgramaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/programa")
public class ProgramaController {

    @Autowired
    private ProgramaService programaService;


    @GetMapping("/")
    public ResponseEntity<List<Programa>> findAll(){
        return ResponseEntity.ok().body(programaService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Programa> findById(@PathVariable int id){
        Programa proyecto = programaService.findById(id);

        if (proyecto != null){
            return ResponseEntity.ok().body(programaService.findById(id));
        }else{
            return ResponseEntity.noContent().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable int id){
        programaService.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
