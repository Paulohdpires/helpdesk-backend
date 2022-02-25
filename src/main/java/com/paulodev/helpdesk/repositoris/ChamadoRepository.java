package com.paulodev.helpdesk.repositoris;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulodev.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{
}
