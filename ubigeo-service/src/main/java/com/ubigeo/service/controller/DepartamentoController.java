package com.ubigeo.service.controller;

import com.ubigeo.service.serviceImp.DepartamentoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {
    @Autowired
    private DepartamentoServiceImp serviceImp;

    @GetMapping("/")
    public ResponseEntity<Map<String, Object>> findAll(){
        Map<String, Object> dep = serviceImp.findAll();
        return  ResponseEntity.ok(dep);
    }
}
