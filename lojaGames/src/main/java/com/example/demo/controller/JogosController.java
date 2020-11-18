package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.JogosModel;
import com.example.demo.repository.JogosRepository;

@RestController
@RequestMapping("/jogos")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class JogosController {

	@Autowired
	private JogosRepository repository;
	
	@GetMapping
	public List<JogosModel> findAllProduto(){
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<JogosModel> findByIdProduto (@PathVariable Long id){
		return repository.findById(id);
	}
	
	@GetMapping("/descricao/{descricao}")
	public ResponseEntity<List<JogosModel>> findByDescricaoProduto (@PathVariable String descricao){
		return ResponseEntity.ok(repository.findAllByDescricaoContainingIgnoreCase(descricao));
	}
	
	@PostMapping
	public ResponseEntity<JogosModel> postProduto (@RequestBody JogosModel jogo){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(jogo));
	}
	
	@PutMapping("/{id}")
	public JogosModel putProduto (@PathVariable Long id, @RequestBody JogosModel objJogos) {
		objJogos.setId(id);
		repository.save(objJogos);
		return objJogos;
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduto (@PathVariable Long id) {
		repository.deleteById(id);
	}
}