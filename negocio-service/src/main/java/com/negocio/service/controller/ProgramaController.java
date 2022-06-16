package com.negocio.service.controller;

import com.negocio.service.entity.Programa;
import com.negocio.service.serviceImp.ProgramaServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/programa")
public class ProgramaController {

    @Autowired
    private ProgramaServiceImp programaServiceImp;


    @GetMapping("/")
    public ResponseEntity<List<Programa>> findAll(){
        return ResponseEntity.ok().body(programaServiceImp.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Programa> findById(@PathVariable int id){
        Programa proyecto = programaServiceImp.findById(id);

        if (proyecto != null){
            return ResponseEntity.ok().body(programaServiceImp.findById(id));
        }else{
            return ResponseEntity.noContent().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable int id){
        programaServiceImp.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
