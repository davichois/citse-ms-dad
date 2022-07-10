package com.participante.citse.controller;

import com.participante.citse.entity.PPTaller;
import com.participante.citse.service.PPTallerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("PPTaller")
public class PPTallerController {

    @Autowired
    private PPTallerService service;


    @GetMapping
    public List<PPTaller> findAll(){
        return service.findAll();
    }

    @GetMapping("/taller/{id}")
    public List<PPTaller> findAllForTaller(@PathVariable Integer id){
        return service.findAll().stream().filter(ppTaller -> ppTaller.getIdTaller() == id).collect(Collectors.toUnmodifiableList());
    }

    @GetMapping("/{id}")
    public PPTaller findById(@PathVariable Integer id){
        return service.findById(id);
    }

    @PostMapping
    public PPTaller save(@RequestBody PPTaller ppTaller){
        return service.save(ppTaller);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        service.deleteById(id);
    }
}
