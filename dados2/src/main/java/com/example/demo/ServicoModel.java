package com.example.demo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.JsonFormat;
@Entity

public class ServicoModel {

	// atributos
		// Criando um id, auto incrementavel
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		@Column
		private String nomeServico;
		@Column
		@JsonFormat(pattern = "yyyy-mm-dd")
		private Date data;
		// getters e setters
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getNomeServico() {
			return nomeServico;
		}
		public void setNomeServico(String nomeServico) {
			this.nomeServico = nomeServico;
		}
		public Date getData() {
			return data;
		}
		public void setData(Date data) {
			this.data = data;
		}
	}
	

