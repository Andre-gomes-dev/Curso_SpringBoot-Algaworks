package com.geekstore.estudo.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.geekstore.estudo.domain.exception.EntidadeEmUsoException;
import com.geekstore.estudo.domain.exception.EntidadeNaoEncontradaException;
import com.geekstore.estudo.domain.model.Cozinha;
import com.geekstore.estudo.domain.repository.CozinhaRepository;

@Service
public class CadastroCozinhaService {

	@Autowired
	private CozinhaRepository cozinhaRepository;
	
	public Cozinha salvar(Cozinha cozinha) {
		return cozinhaRepository.salvar(cozinha);
	}
	
	public void excluir(Long cozinhaId) {
		try {
		cozinhaRepository.remover(cozinhaId);
		}catch(EmptyResultDataAccessException e) {
			throw new EntidadeNaoEncontradaException(String.format
					("Não existe um Cadastro de cozinha com código %d", cozinhaId));
		
		}catch(DataIntegrityViolationException e){
		throw new EntidadeEmUsoException(String.format
				("Cozinha de %d não pode ser remoida, pois está em uso", cozinhaId));
	}
  }
}