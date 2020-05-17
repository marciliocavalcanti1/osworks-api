package br.com.algaworks.osworks.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.algaworks.osworks.domain.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
