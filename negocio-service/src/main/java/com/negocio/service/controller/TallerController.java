package com.negocio.service.controller;

import com.negocio.service.entity.Taller;
import com.negocio.service.service.TallerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/taller")
public class TallerController {

    @Autowired
    private TallerService tallerService;


    @GetMapping("/")
    public ResponseEntity<List<Taller>> findAll(){
        return ResponseEntity.ok().body(tallerService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Taller> findById(@PathVariable int id){
        Taller proyecto = tallerService.findById(id);

        if (proyecto != null){
            return ResponseEntity.ok().body(tallerService.findById(id));
        }else{
            return ResponseEntity.noContent().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable int id){
        tallerService.deleteById(id);
        return ResponseEntity.ok().build();
    }


}
