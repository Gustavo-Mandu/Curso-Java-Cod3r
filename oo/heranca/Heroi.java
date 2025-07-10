package oo.heranca;

public class Heroi extends Jogador {

	public Heroi() {
		super(0, 0);
	}
	
	public Heroi(int x, int y){
		super(x, y);
	}
	
	@Override
    public boolean atacar(Jogador oponente, int diminuirVida) {
    	 boolean ataque1 = super.atacar(oponente, diminuirVida);
    	 boolean ataque2 = super.atacar(oponente, diminuirVida);
    	 boolean ataque3 = super.atacar(oponente, diminuirVida);
    	 return ataque1 || ataque2 || ataque3;
    }
	
}
