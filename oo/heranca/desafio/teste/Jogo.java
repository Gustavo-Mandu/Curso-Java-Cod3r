package oo.heranca.desafio.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {
		
		Monstro monstro = new Monstro(20, 30); // parâmetro inutil
		monstro.x = 10;
		monstro.y = 10; 
		
		Heroi heroi = new Heroi(10, 11);
	/*	heroi.x = 10;
		heroi.y = 11; */
		
		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Herói tem => " + heroi.vida);
		
		monstro.atacar(heroi, 0);
		heroi.atacar(monstro, 5);
		
		monstro.atacar(heroi, 0);
		heroi.atacar(monstro, 3);
		
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi, 0);
		heroi.atacar(monstro, 0);
		
		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Herói tem => " + heroi.vida);
	}
}

/* j1.andar(Direcao.NORTE);		
j1.andar(Direcao.LESTE);		
j1.andar(Direcao.NORTE);		
j1.andar(Direcao.LESTE); */		
