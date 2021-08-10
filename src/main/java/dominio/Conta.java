package dominio;

public class Conta {

	private String numeroAgencia;
	private String numeroConta;
	private Correntista correntista;
	private String chavePix;
	private float saldo;
	private String nomeBanco = "BancoPrideDev";
	private String tipoDeConta;
	private float valorPadraoSaque = 50;
	private float chequeEspecial = 10;
	
	public float mostrarSaldo() {
		return saldo;
	}
	
	public String mostrarChavePix() {
		return chavePix;
	}

	
	
	
	
	public Conta() {
	}
	
	public Conta(String numeroAgencia, String NumeroConta, float saldo) {
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	public void saqueAmanda(float x) {
		System.out.println("Saldo = R$" + this.saldo);
		if (this.saldo > x) {
			this.saldo -= x;
		} else {
			if (this.saldo + chequeEspecial > x) {
				this.saldo -= x;
				System.out.println("Saldo está negativo");
				System.out.println("Saldo = R$" + this.saldo);
			} else {
				System.out.println("Saldo está insuficiente");
				System.out.println("Saldo = R$" + this.saldo);
			}
		}
	}

	public void saqueErick(float valorSaque) {
		System.out.println("Saldo Anterior: R$" + this.saldo);
		if (valorSaque <= this.saldo) {
			this.saldo -= valorSaque;
		} else {
			System.out.println("Saldo insuficiente para saque");
			if (valorSaque <= (this.chequeEspecial + this.saldo)) {
				System.out.println("Saque realizado no Cheque Especial");
				System.out.println("Cheque Especial Anterior: R$" + this.chequeEspecial);
				valorSaque -= this.saldo;
				this.saldo = 0;
				this.chequeEspecial -= valorSaque;
				System.out.println("Você utilizou R$" + valorSaque + " do Cheque Especial\n"
						+ "Cheque Especial Atual: R$" + this.chequeEspecial);
			} else {
				System.out.println("Não foi possível realizar saque com Cheque Especial");
			}
		}

		System.out.println("Saldo Atual: R$" + this.saldo);
	}

}