package dominio;

import static util.Validador.validaCPF;

public class Cliente {

	protected String cpfCorrentista;
	protected String nomeCorrentista;
	
	public Cliente(String nome, String cpf) {
		validaCPF(cpf);
		this.nomeCorrentista = nome;
		this.cpfCorrentista = cpf;
	}

	public String getNome() {
<<<<<<< HEAD
		if(true)
			throw new RuntimeException("erro Generico");
=======
>>>>>>> 568c6b8d27921aff243605f81d3668589c4aa49e
		return nomeCorrentista;
	}

	public String getCPF() {
		return cpfCorrentista;
	}
	
	//contrutor que recebe nome e cpf
	//validar cpf
	// se cpf invalido dá erro do tipo InvalidArgument;
}