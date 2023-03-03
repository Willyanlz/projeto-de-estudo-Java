package com.projetodeestudo.carromarca.repositories;

import com.projetodeestudo.carromarca.entities.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
}
