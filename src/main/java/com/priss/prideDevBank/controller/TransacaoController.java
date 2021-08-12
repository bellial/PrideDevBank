package com.priss.prideDevBank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.priss.prideDevBank.entity.ContaEntity;
import com.priss.prideDevBank.entity.TransacaoEntity;
import com.priss.prideDevBank.services.ContaService;
import com.priss.prideDevBank.services.TransacaoService;

@RestController
public class TransacaoController {

	@Autowired
	TransacaoService transacaoService;
	
	@PostMapping("/transacao/{numeroConta}/{numeroAgencia}")
	public ResponseEntity<TransacaoEntity> criaTransacao(@PathVariable String numeroConta,
			@PathVariable String numeroAgencia , @RequestBody TransacaoEntity transacao){
		
		transacaoService.criaTransacao(transacao,numeroConta,numeroAgencia);
		
		return ResponseEntity.ok(transacao);
	
	}
	
}
