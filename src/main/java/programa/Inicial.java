package programa;

import dominio.Conta;

public class Inicial {
	public static void main(String[] args) {
		
		Conta contaCorrente = new Conta("001","000001",1000);

		Conta contaPoupanca = new Conta("001","000001",100);
	
		
		System.out.println("Conta Corrente");

		contaCorrente.saqueErick(1102);

		

	}	

}
