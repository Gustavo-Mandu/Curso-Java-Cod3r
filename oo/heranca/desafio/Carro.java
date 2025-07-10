package oo.heranca.desafio;

public class Carro {

	public final int VELOCIDADE_MAXIMA;
	public int velocidadeAtual;
	private int delta = 5;
	
	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	protected Carro(){
		this.VELOCIDADE_MAXIMA = 90;
	}
	
	public double acelerar() {
		if(velocidadeAtual + getDelta() >= VELOCIDADE_MAXIMA) {
			double retorno = (velocidadeAtual = VELOCIDADE_MAXIMA);
			return retorno;
		} else
		return this.velocidadeAtual += getDelta();
	}

	public double frear() {
		if (velocidadeAtual >= 5)
			return velocidadeAtual -= 5;
		else
			return velocidadeAtual = 0;
	}
	
	@Override
	public String toString() {
		return "Velocidade Atual: " + velocidadeAtual;
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
	
}