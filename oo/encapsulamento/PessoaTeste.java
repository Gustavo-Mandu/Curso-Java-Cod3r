package oo.encapsulamento;

public class PessoaTeste {

	

	public static void main(String[] args) {
		 
		Pessoa p1 = new Pessoa(-45, "Amoedo", "João");
		// p1.idade = -30; // alterar
		p1.setIdade(230); // alterar
		
		System.out.println(p1); // toString()
		System.out.println(p1.getNome()); // ler nome
		System.out.println(p1.getIdade()); // ler idade
		System.out.println(p1.getNomeCompleto());
	}
}
