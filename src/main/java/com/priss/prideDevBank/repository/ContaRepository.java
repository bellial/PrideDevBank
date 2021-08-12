package com.priss.prideDevBank.repository;

import org.springframework.data.repository.CrudRepository;

import com.priss.prideDevBank.entity.ClienteEntity;
import com.priss.prideDevBank.entity.ContaEntity;

public interface ContaRepository extends CrudRepository<ClienteEntity, Integer> {

ContaEntity findByNumeroConta( String numeroConta);
	
	ContaEntity findByNumeroContaAndNumeroAgencia(String numeroConta, String numeroAgencia);

	void save(ContaEntity conta);

}
