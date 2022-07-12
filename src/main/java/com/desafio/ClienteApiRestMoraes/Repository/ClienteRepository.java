package com.desafio.ClienteApiRestMoraes.Repository;

import com.desafio.ClienteApiRestMoraes.Model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
