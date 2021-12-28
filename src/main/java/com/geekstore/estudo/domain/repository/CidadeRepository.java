package com.geekstore.estudo.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geekstore.estudo.domain.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

	
}
