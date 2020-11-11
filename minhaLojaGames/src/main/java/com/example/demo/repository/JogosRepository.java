package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Jogos;

public interface JogosRepository extends JpaRepository<Jogos, Long> {

	public List<Jogos> findAllByDescricaoContainingIgnoreCase(String descricao);
}