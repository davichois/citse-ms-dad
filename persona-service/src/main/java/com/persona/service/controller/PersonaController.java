package com.persona.service.controller;

import com.persona.service.entity.Persona;
import com.persona.service.serviceImp.PersonaServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private PersonaServiceImp personaServiceImp;


    @GetMapping("/")
    public ResponseEntity<List<Persona>> findAll(){
        return ResponseEntity.ok().body(personaServiceImp.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Persona> findById(@PathVariable int id){
        Persona persona = personaServiceImp.findById(id);

        if (persona != null){
            return ResponseEntity.ok().body(personaServiceImp.findById(id));
        }else{
            return ResponseEntity.noContent().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable int id){
        personaServiceImp.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
