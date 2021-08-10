package com.priss.prideDevBank.repository;

import org.springframework.data.repository.CrudRepository;

import com.priss.prideDevBank.entity.ClienteEntity;
import com.priss.prideDevBank.entity.ContaEntity;

public interface ContaRepository extends CrudRepository<ClienteEntity, Integer> {

	void save(ContaEntity conta);

}
