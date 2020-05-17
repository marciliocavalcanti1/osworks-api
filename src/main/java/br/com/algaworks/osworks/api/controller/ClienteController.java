package br.com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.algaworks.osworks.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setEmail("usuario1@teste.com");
		cliente1.setNome("Usuario 01 - Update");
		cliente1.setTelefone("8199887766");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setEmail("usuario2@teste.com");
		cliente2.setNome("Usuario 02");
		cliente2.setTelefone("8177665544");
		
		return Arrays.asList(cliente1, cliente2);
	}
	
}
