package com.priss.prideDevBank.repository;

import org.springframework.data.repository.CrudRepository;

import com.priss.prideDevBank.entity.ClienteEntity;

public interface ContaRepository extends CrudRepository<ClienteEntity, Integer> {

}
