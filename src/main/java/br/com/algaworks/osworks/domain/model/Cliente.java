package br.com.algaworks.osworks.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Entity
@SequenceGenerator(name = "ID_CLIENTE_SQ", sequenceName = "ID_CLIENTE_SQ", allocationSize = 1, initialValue = 1)
public @Data class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String nome;
	private String email;
	private String telefone;
}
