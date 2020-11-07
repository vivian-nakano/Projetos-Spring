package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

//FAZ A CONDUÇÃO DA TABELA PARA BANCO DE DADOS.reponsavel por pegar dados da tabela e levar pro banco de dados
//PARA FAZER GET E POSTS VC PRECISA PERSISTIR

public interface ManutencaoRepository extends JpaRepository<ManutencaoTable, Long> {

	Optional<ManutencaoTable> findByNomeAndCategoria(String nome, String categoria);

	List<ManutencaoTable> findByNome(String nome);
	
}
