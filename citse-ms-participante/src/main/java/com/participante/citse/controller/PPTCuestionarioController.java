package com.participante.citse.controller;

import com.participante.citse.entity.PPTCuestionario;
import com.participante.citse.service.PPTCuestionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("PPTCuestionario")
public class PPTCuestionarioController {

    @Autowired
    private PPTCuestionarioService service;

    @GetMapping
    public List<PPTCuestionario> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public PPTCuestionario findById(@PathVariable Integer id){
        return service.findById(id);
    }

    @PostMapping
    public PPTCuestionario save(@RequestBody PPTCuestionario pptCuestionario){
        return service.save(pptCuestionario);
    }

    @PutMapping("/{id}")
    public PPTCuestionario update(@RequestBody PPTCuestionario pptCuestionario,@PathVariable Integer id){
        PPTCuestionario pptc = service.findById(id);
        pptc.setIdCuestionario(pptCuestionario.getIdCuestionario());
        pptc.setIdPPTaller(pptCuestionario.getIdPPTaller());
        service.save(pptc);
        return pptc;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        service.deleteById(id);
    }
}
