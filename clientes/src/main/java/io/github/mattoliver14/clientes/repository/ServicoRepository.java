package io.github.mattoliver14.clientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.mattoliver14.clientes.model.entity.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Integer>{

}
