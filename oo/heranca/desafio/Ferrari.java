package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

	private boolean ligarTurbo; // false
	private boolean ligarAr; // false
	
	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
	}

	public Ferrari() {
		super(); // não é necessário colocar o super() nesse caso
		// pois o super() chama o construtor padrão, entretanto,
		// o construtor Ferrari() já faz isso sem precisar do super().
		// O super() deve ser usado quando o construtor de Ferrari()
		// não for padrão, tipo o primeiro ali!
	}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}

	@Override
	public void ligarAr() {
		ligarAr = true;
	}

	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	
/*	@Override
	public int velocidadeDoAr() {
		// TODO Auto-generated method stub
		return 2;
	} */
	
	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		} else if(ligarTurbo && ligarAr) {
			return 30;
		} else if (!ligarTurbo && !ligarAr) {
			return 20;
		} else
		return 15;
	}

	@Override
	public double acelerar() { // estranho, ruim, NÃO USAR, com retorno malfuncional mas funciona ;-; return
		// super.acelerar() + ((velocidadeAtual < VELOCIDADE_MAXIMA) ?
		// (this.velocidadeAtual += 10) : 0);
		if (velocidadeAtual + getDelta() >= VELOCIDADE_MAXIMA) {
			double retorno = (velocidadeAtual = VELOCIDADE_MAXIMA);
			return retorno;
		} else
			return this.velocidadeAtual += getDelta();
	}

	@Override
	public String toString() {
		return "Velocidade Ferrari: " + velocidadeAtual + " Km/h";
	}

}
