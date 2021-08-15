package com.priss.prideDevBank.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.priss.prideDevBank.entity.ContaEntity;
import com.priss.prideDevBank.repository.ContaRepository;

@Service
public class ContaService {
	@Autowired
	ContaRepository contaRepository;

	public ContaEntity salvarConta(ContaEntity conta) {
		contaRepository.save(conta);

		return conta;
	}

	public ContaEntity getConta(String numeroAgencia, String numeroConta) {
		List<ContaEntity> contaList = contaRepository
				.findByNumeroAgenciaAndNumeroConta(numeroAgencia, numeroConta);
		
		ContaEntity contaEntity = contaList.get(0);
		
		return contaEntity;

	}

}