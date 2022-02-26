package com.paulodev.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paulodev.helpdesk.domain.Chamado;
import com.paulodev.helpdesk.domain.Cliente;
import com.paulodev.helpdesk.domain.Tecnico;
import com.paulodev.helpdesk.domain.enums.Perfil;
import com.paulodev.helpdesk.domain.enums.Prioridade;
import com.paulodev.helpdesk.domain.enums.Status;
import com.paulodev.helpdesk.repositoris.ChamadoRepository;
import com.paulodev.helpdesk.repositoris.ClienteRepository;
import com.paulodev.helpdesk.repositoris.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public void intanciaDB() {
		Tecnico tec1 = new Tecnico(null, "Paulo", "808.053.130-79", "paulo@gmail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Tecnico tec2 = new Tecnico(null, "luciana", "463.996.010-70", "luciana@gmail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);

		Cliente cli1 = new Cliente(null, "Linus Torvalds", "128.226.520-23", "linus@gmail.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1, tec2));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}

}
