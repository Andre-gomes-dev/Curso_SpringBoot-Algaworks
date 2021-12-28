package com.geekstore.estudo.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geekstore.estudo.domain.model.Restaurante;

public interface RestauranteRepository extends JpaRepository<Restaurante, Long>{

	
}
