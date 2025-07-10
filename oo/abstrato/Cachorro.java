package oo.abstrato;

public class Cachorro extends Mamifero {

	@Override
	public String mamar() {
		return "Usando leite";
	}

	
	// mover() final em mamifero
	// faria com que não fosse
	// possível alterar o método
	// aqui, daria erro.
	@Override
	public String mover() { 
		return "Usando as patas";
	} 
	
	
}
