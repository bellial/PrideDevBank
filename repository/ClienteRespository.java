package com.priss.prideDevBank.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.priss.prideDevBank.entity.ClienteEntity;

@Repository
public interface ClienteRespository extends CrudRepository<ClienteEntity,Integer>{

}
