package com.projetodeestudo.carromarca.repositories;

import com.projetodeestudo.carromarca.entities.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {

}
