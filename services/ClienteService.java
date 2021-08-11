package com.priss.prideDevBank.services;


import static com.priss.prideDevBank.util.ValidationUtil.validarCPF;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.priss.prideDevBank.entity.ClienteEntity;
import com.priss.prideDevBank.repository.ClienteRespository;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRespository clienteRespository;
	
	@Autowired
	ClienteEntity cliente;

	
	public ClienteEntity criarNovoCliente(ClienteEntity cliente) {
		validarCPF(cliente.getCpf());
		clienteRespository.save(cliente);
		
		return cliente;
		
	}
	
	
	public ClienteEntity pesquisaCliente(Integer id) {
		Optional<ClienteEntity> clienteOptional = clienteRespository.findById(id);
		
		if(clienteOptional.isPresent()) {
			return clienteOptional.get();
		}
		
		return  null;
	}

}
