package com.paulodev.helpdesk.repositoris;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulodev.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
}
