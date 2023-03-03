package com.projetodeestudo.carromarca.entities;

import javax.persistence.*;

@Entity
@Table(name = "tb_carro")
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name, model;

    @ManyToOne
    @JoinColumn(name = "marca_id")
    private Marca marca;

    public Carro() {
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Marca getMarca() {
        return marca;
    }
    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    
}
