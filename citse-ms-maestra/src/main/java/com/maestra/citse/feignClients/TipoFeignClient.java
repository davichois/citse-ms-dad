package com.maestra.citse.feignClients;

import com.maestra.citse.dao.Tipo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "tipo-service")
@RequestMapping("/tipo")
public interface TipoFeignClient {

    @GetMapping("/")
    public List<Tipo> findAll();

    @GetMapping("/{id}")
    public Tipo findById(@PathVariable int id);
}
