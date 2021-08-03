package executavel;
import dominio.Conta;
public class ContaNova {

	public static void main(String[] args) {
		Conta conta = new Conta();
		System.out.println(conta.mostrarSaldo());
		System.out.println(conta.mostrarChavePix());
	}

}
