package com.negocio.service.controller;

import com.negocio.service.entity.Taller;
import com.negocio.service.serviceImp.TallerServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/taller")
public class TallerController {

    @Autowired
    private TallerServiceImp tallerServiceImp;


    @GetMapping("/")
    public ResponseEntity<List<Taller>> findAll(){
        return ResponseEntity.ok().body(tallerServiceImp.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Taller> findById(@PathVariable int id){
        Taller proyecto = tallerServiceImp.findById(id);

        if (proyecto != null){
            return ResponseEntity.ok().body(tallerServiceImp.findById(id));
        }else{
            return ResponseEntity.noContent().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable int id){
        tallerServiceImp.deleteById(id);
        return ResponseEntity.ok().build();
    }


}
