package com.projetodeestudo.carromarca.controllers;

import com.projetodeestudo.carromarca.entities.Carro;
import com.projetodeestudo.carromarca.repositories.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/carros")
public class CarroController {

    @Autowired
    private CarroRepository repositorio;

    @GetMapping
    public List<Carro> findAll() {
        List<Carro> result = repositorio.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public Carro findById(@PathVariable Long id) {
        Carro result = repositorio.findById(id).get();
        return result;
    }

    @PostMapping
    public Carro insert(@RequestBody Carro carro) {
        Carro result = repositorio.save(carro);
        return result;
    }
}
