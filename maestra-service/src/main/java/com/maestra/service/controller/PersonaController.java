package com.maestra.service.controller;

import com.maestra.service.entity.Persona;
import com.maestra.service.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private PersonaService personaService;


    @GetMapping("/")
    public ResponseEntity<List<Persona>> findAll(){
        return ResponseEntity.ok().body(personaService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Persona> findById(@PathVariable int id){
        Persona persona = personaService.findById(id);

        if (persona != null){
            return ResponseEntity.ok().body(personaService.findById(id));
        }else{
            return ResponseEntity.noContent().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable int id){
        personaService.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
