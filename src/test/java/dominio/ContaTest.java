<<<<<<< HEAD
<<<<<<< HEAD
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
=======
=======
>>>>>>> refs/remotes/PrideDevBank/main
//package dominio;
//
//
//
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//public class ContaTest {
//	
//	Conta conta ;
//	@BeforeEach
//	void inicial() {
//		conta = new Conta();
//		conta.depositar(1000);
//	}
//	
//	
//	
//	@Test
//	void deveSerPossivelCriarUmaConta() {
//		assertTrue(conta != null);
//	}
//	
//	@Test
//	void deveSerPossivelAdicionarUmaChavePix() {
//
//		//execucão
//		conta.adicionarChavePix("anaalice.cd@gmail.com");
//		//validação
//		assertTrue(conta.getChavePix(0).equals("anaalice.cd@gmail.com"));
//	}
//	@Test
//	void deveSerPossivelSacarQuandoTemosLimite() {
//
//		//execução
//		conta.sacar(200);
//		
//		//validação
//		assertTrue(800 == conta.getSaldo() );
//	}
//
//	@Test
//	void deveSerPossivelTransferirParaOutraContaQuandoTemSaldo() {
//		Conta contaDestino = new Conta();
//		contaDestino.depositar(100);
//		
//		conta.trasferir(2, contaDestino);
//		
//		assertTrue(contaDestino.getSaldo() == 102);
//	}
//	
//	
//	
//	
//}
<<<<<<< HEAD
>>>>>>> clienteDao
=======
>>>>>>> refs/remotes/PrideDevBank/main
