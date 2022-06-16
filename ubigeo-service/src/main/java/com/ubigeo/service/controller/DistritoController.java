package com.ubigeo.service.controller;

import com.ubigeo.service.serviceImp.DistritoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(name="/distritos")
public class DistritoController {

    @Autowired
    private DistritoServiceImp serviceImp;

    @GetMapping("/")
    public ResponseEntity<Map<String, Object>> findAll(){
        Map<String, Object> distrito = serviceImp.findAll();
        return  ResponseEntity.ok(distrito);
    }
}
