package executavel;

import java.util.Scanner;

<<<<<<< HEAD
import Exceptions.SaldoInsufucienteException;
import dominio.Cliente;
import dominio.Conta;
import dominio.ContaCorrente;
=======
>>>>>>> 568c6b8d27921aff243605f81d3668589c4aa49e

public class EntradaDados {

	public static void main(String[] args) {
<<<<<<< HEAD

		String gatinhosDaTv[] = { "Mel Gibson", "Deniro", "Fagundes", "Caio Castro" ,"Matheus Solano"};
		
		int i = 0;
		while(i < gatinhosDaTv.length) {
			System.out.println(gatinhosDaTv[i]);
			i++;
		}
		

		for (int contador = 0; contador < gatinhosDaTv.length ; contador++) {
			String inicial = gatinhosDaTv[contador].substring(0, 1);
			if (inicial.equals("M")) {
				System.out.println(gatinhosDaTv[contador]);
			}

		}

		for(String nome : gatinhosDaTv) {
			System.out.println(nome);
		}
		
		Scanner entrada = new Scanner(System.in);
		String texto = "";
		
		
		while(! texto.equals("sair")) {
			System.out.println("Digite um texto:");
			texto =entrada.nextLine();
		}
=======
	 
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite o valor a ser sacado:");
		int valor = entrada.nextInt();
		
		
		
		CaixaEletronico.retirar(valor);
>>>>>>> 568c6b8d27921aff243605f81d3668589c4aa49e

	}

}
