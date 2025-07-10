package oo.encapsulamento;

public class Pessoa {

	private String nome;
	private String sobrenome;
	private int idade;
	
	public Pessoa(int idade, String sobrenome, String nome) {
		setIdade(idade);
		setSobrenome(sobrenome);
		setNome(nome);
	}

	// Getter
	public int getIdade() {
		return idade;
	}

	// Setter
	public void setIdade(int idade) {
		idade = Math.abs(idade); // negativo vira positivo
		if (idade >= 0 && idade <= 120)
			this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public String getNomeCompleto() {
		return getNome() + " " + getSobrenome();
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	@Override
	public String toString() {
		return "Olá, sou o " + getNome() + " e tenho " + getIdade() + " anos.";
	}
	
}
