package com.priss.prideDevBank.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.priss.prideDevBank.entity.ContaEntity;
import com.priss.prideDevBank.entity.TransacaoEntity;

@Repository
public interface TransacaoRepository extends CrudRepository<TransacaoEntity, Integer> {

	public List<TransacaoEntity> findByContaOrigem(ContaEntity contaOrigem);
}
