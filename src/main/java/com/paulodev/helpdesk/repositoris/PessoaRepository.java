package com.paulodev.helpdesk.repositoris;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulodev.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{
}
