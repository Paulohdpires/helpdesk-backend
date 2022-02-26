package com.paulodev.helpdesk.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paulodev.helpdesk.domain.Tecnico;
import com.paulodev.helpdesk.repositoris.TecnicoRepository;
import com.paulodev.helpdesk.services.exceptions.ObjectNotFoundException;

@Service
public class TecnicoService {
	
	@Autowired
	private TecnicoRepository repository;
	
	public Tecnico findById(Integer id) {
		Optional<Tecnico> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: "+id ));
	}
}
