package com.priss.prideDevBank.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.priss.prideDevBank.entity.ContaEntity;
import com.priss.prideDevBank.services.ContaService;


@RestController
public class ContaController {

	@Autowired
	ContaService service;

	@PostMapping(value = "/conta", produces = "application/json", consumes = "application/json")
	public ResponseEntity<ContaEntity> criarConta(@RequestBody ContaEntity conta) {

		ContaEntity novaConta = service.salvarConta(conta);

		URI uri = URI.create("/cliente/" + novaConta.getId());

		return ResponseEntity.created(uri).body(novaConta);
	}

//	@GetMapping("/cliente/${id}")
//	public ResponseEntity<ContaEntity> consultarConta(){
//		
//		
//		return ResponseEntity.ok(cliente);
//		
//	}

}
