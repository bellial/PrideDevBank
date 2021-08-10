package dominio;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ContaTest {
	@Test
	 void deveSerPossivelCriarContaComNumeroAgenciaNumeroContaSaldo() {
	  Conta conta = new Conta("00001","001",300);
	  org.junit.jupiter.api.Assertions.assertTrue(conta.saldo == 300);
	  org.junit.jupiter.api.Assertions.assertTrue(conta.numeroAgencia.equals("001"));
	  org.junit.jupiter.api.Assertions.assertTrue(conta.numeroConta.equals("00001"));
	 }
}
