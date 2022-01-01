package com.geekstore.estudo.domain.repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.query.Param;

import com.geekstore.estudo.domain.model.Restaurante;

public interface RestauranteRepository 
extends JpaRepository<Restaurante, Long>, RestauranteRepositoryQueries, 
JpaSpecificationExecutor<Restaurante>{

	
	List<Restaurante> queryByTaxaFreteBetween(BigDecimal taxaInicial, BigDecimal taxaFinal);
	//(pode ser tambem (query, get, stream, ou o que ja esta sendo usado o find)
	
	//List<Restaurante> findByNomeContainingAndCozinhaId(String nome, Long cozinha);
	
	//@Query("from Restaurante  where nome like %:nome% and cozinha.id = :id")
	List<Restaurante> consultarPorNome(String nome, @Param("id") Long cozinha);
	
	Optional<Restaurante> findFirstRestauranteBynomeContaining(String nome);

	List<Restaurante> findTop2ByNomeContaining(String nome);

	
	int countByCozinhaId(Long cozinha);	
} 
