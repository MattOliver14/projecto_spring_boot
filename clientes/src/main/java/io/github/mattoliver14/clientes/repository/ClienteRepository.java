package io.github.mattoliver14.clientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.mattoliver14.clientes.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
