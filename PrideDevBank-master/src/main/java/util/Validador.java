package util;
public class Validador {
	public static void  validaCPF(String cpf){
<<<<<<< HEAD
		if(cpf.length() != 11) {
=======
		if(cpf.length() <11  && cpf.isEmpty()) {
>>>>>>> 568c6b8d27921aff243605f81d3668589c4aa49e
			throw new IllegalArgumentException("CPF Invalido");
		}
		
	}
}
