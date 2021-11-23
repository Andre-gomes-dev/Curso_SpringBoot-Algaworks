package com.geekstore.estudo.domain.repository;

import java.util.List;

import com.geekstore.estudo.domain.model.Restaurante;

public interface RestauranteRepository {

	List<Restaurante> listar();
	Restaurante buscar(Long id);
	Restaurante salvar(Restaurante Restaurante);
	void remover(Restaurante Restaurante);
	
}
