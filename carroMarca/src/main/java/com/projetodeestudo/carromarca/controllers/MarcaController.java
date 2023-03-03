package com.projetodeestudo.carromarca.controllers;

import com.projetodeestudo.carromarca.entities.Carro;
import com.projetodeestudo.carromarca.entities.Marca;
import com.projetodeestudo.carromarca.repositories.CarroRepository;
import com.projetodeestudo.carromarca.repositories.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (value = "/marcas")
public class MarcaController {

    @Autowired
    private MarcaRepository repositorio;

    @GetMapping
    public List<Marca> findAll() {
        List<Marca> result = repositorio.findAll();
        return result;
    }
    @GetMapping(value = "/{id}")
    public Marca findById(@PathVariable Long id) {
        Marca result = repositorio.findById(id).get();
        return result;
    }

    @PostMapping
    public Marca insert(@RequestBody Marca marca) {
        Marca result = repositorio.save(marca);
        return result;
    }
}
