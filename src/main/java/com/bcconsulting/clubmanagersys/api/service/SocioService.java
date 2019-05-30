package com.bcconsulting.clubmanagersys.api.service;

import java.util.Optional;

import com.kazale.pontointeligente.api.entities.Empresa;

public interface SocioService {

	/**
	 * Cadastra um novo socio na base de dados.
	 * 
	 * @param Socio
	 * @return Socio
	 */
	Socio persistir(Socio socio);
	
}
