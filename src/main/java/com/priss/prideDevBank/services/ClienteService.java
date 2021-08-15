package com.priss.prideDevBank.services;


import static com.priss.prideDevBank.util.ValidationUtil.validarCPF;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.priss.prideDevBank.entity.ClienteEntity;
import com.priss.prideDevBank.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository clienteRepository;

	
	public ClienteEntity criarNovoCliente(ClienteEntity cliente) {
		validarCPF(cliente.getCpf());
		clienteRepository.save(cliente);

		return cliente;

	}

	public ClienteEntity pesquisaCliente(Integer id) {
		Optional<ClienteEntity> clienteOptional = clienteRepository.findById(id);

		if (clienteOptional.isPresent()) {
			return clienteOptional.get();
		}

		return null;
	}

}
