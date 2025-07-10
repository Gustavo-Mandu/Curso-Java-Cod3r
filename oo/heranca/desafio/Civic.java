package oo.heranca.desafio;

public class Civic extends Carro {

	public Civic(int velocidadeMaxima) {
		super(velocidadeMaxima);
	}

	public Civic(){
	 super(95);
	}
	
	@Override
	public double acelerar() {
		// delta = 11;
		return super.acelerar(); // legal
	}
	
	@Override
	public String toString() {
		return "Velocidade Civic: " + velocidadeAtual + " Km/h";
	}
}
