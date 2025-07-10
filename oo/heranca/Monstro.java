package oo.heranca;

public class Monstro extends Jogador {

	public Monstro() {
		super(0, 0);
	}
	
	public Monstro(int x, int y) { // mesmo tendo parâmetro eu não estou usando eles na lógica do super! isso é possível.
		super(0, 0); // o correto seria (x, y);
	}

}
