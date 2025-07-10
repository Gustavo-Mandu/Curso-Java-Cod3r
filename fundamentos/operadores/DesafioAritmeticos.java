package fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
		double equacao1, equacao2;
		double divisao1, divisao2, divisaoFinal;
		double somaFinal, resultado;
		
		equacao1 = Math.pow(6 * (3 + 2), 2);
		equacao2 = Math.pow((1 - 5) * (2 - 7), 2);
		divisao1 = 3 * 2;
		divisao2 = Math.pow(2, 2);
		divisaoFinal = Math.pow(10, 3);
		
		somaFinal = Math.pow((equacao1 / divisao1) - (equacao2 / divisao2), 3);
		resultado = somaFinal / divisaoFinal;
		System.out.println("O resultado é: "+ (int)resultado);
		
	}

}
