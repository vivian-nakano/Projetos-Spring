package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.JogosModel;

public interface JogosRepository extends JpaRepository<JogosModel, Long> {

	public List<JogosModel> findAllByDescricaoContainingIgnoreCase(String descricao);
}
