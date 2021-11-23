package com.geekstore.estudo.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.geekstore.estudo.AlgafoodApiApplication;
import com.geekstore.estudo.domain.model.Restaurante;
import com.geekstore.estudo.domain.repository.RestauranteRepository;

public class ConsultaRestauranteMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		RestauranteRepository restauranteRepository = applicationContext.getBean(RestauranteRepository.class);
		
		List<Restaurante> todasRestaurantes = restauranteRepository.listar();
		
		for (Restaurante restaurante : todasRestaurantes) {
			System.out.printf("%s -%f -%s\n" ,restaurante.getNome() ,restaurante.getTaxaFrete() ,restaurante.getCozinha().getNome());
		}
	}
	
}
