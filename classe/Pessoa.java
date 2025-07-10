package classe;

public class Pessoa {

	String nome;
	double peso;

	Pessoa() {
	}

	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	double comer(Comida comida) {
		return this.peso += comida.peso;
	}
}
