package com.paulodev.helpdesk.repositoris;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulodev.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{
}
