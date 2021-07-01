package io.github.mattoliver14.clientes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.github.mattoliver14.clientes.model.entity.Cliente;
import io.github.mattoliver14.clientes.repository.ClienteRepository;

@SpringBootApplication
public class ClientesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientesApplication.class, args);
	}

}
