package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//ponto no edereco do site
@RequestMapping ("/hello")
@RestController

public class ServicoController {

	
	// -->MVC --- model (tables)
		//M -->VC --- view (front)
		//MV -->C --- controller (cerebro,enderecamento)
		//JPA é interface
		
//		@GetMapping("/get1")
//		public String hello1 () {
//			return "Hey Get1 Hello World";
//		}
//		
//		@GetMapping("/get2")
//		public String hello2 () {
//			return "Hey Get2 Hello World";
//		}
		
	//INJETEI O REPOSITORIO PARA COMUNICAR COM A TABELA DO BANCO;
	@Autowired
	private ServicoRepository repository;
	
	//get com find all
	@GetMapping("/servicos")
	public List<ServicoModel> pegarTodos() {
		return repository.findAll();
	}
	
	//POST É RESPONSÁVEL POR INSERIR
	
	@PostMapping("/servicos")
	public ServicoModel criar (@RequestBody ServicoModel tabelaServico) {
		repository.save( tabelaServico);
		return tabelaServico;
	}
	
	//método chama criar, request body: é pegar dados do usuários, ServicoModel: referencia da tabela, tabela servico: novo nome pra mesma tabela
	//tá salvando na tabelaServico
	
}
