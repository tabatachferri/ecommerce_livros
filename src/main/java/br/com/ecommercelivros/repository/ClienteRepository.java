package br.com.ecommercelivros.repository;

import br.com.ecommercelivros.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}