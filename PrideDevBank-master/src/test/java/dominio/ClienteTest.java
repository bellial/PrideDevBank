package dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

<<<<<<< HEAD
import util.Validador;

=======
>>>>>>> 568c6b8d27921aff243605f81d3668589c4aa49e
public class ClienteTest {
	
	@Test
	void deveSerPossivelCriarClientePassandoValores() {
		Cliente cliente = new Cliente("Ana","12345678909");
		
<<<<<<< HEAD
		
=======
>>>>>>> 568c6b8d27921aff243605f81d3668589c4aa49e
		String nomeCliente = cliente.getNome();
		String cpfCorrentista = cliente.getCPF();
		
		Assertions.assertEquals("Ana",nomeCliente);
		Assertions.assertEquals("12345678909",cpfCorrentista);
		
	}
	
	
	@Test
	void deveValidarSeCPFContem11Caracteres() {
//		Cliente cliente = new Cliente("Ana","1234567890");
//		
//		String nomeCliente = cliente.getNome();
//		String cpfCorrentista = cliente.getCPF();
//		
//		Assertions.assertEquals("Ana",nomeCliente);
//		Assertions.assertEquals("12345678909",cpfCorrentista);
//		
	}
	
	
	
	

}
