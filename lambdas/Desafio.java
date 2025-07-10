package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {

		Produto p = new Produto("iPad", 3235.89, 0.13);

		/*
		 * 1. A partir do produto calcular o preco real (com desconto) 2. Imposto
		 * Municipal: >= 2500 (8,5%) / < 2500 (Isento) 3. Frete: >= 3000 (100) / < 3000
		 * (50) 4. Arredondar: Deixar duas casas decimais 5. Formatar: R$1234,56
		 */

		Function<Produto, Double> calcularDesconto = produto -> produto.preco * (1 - produto.desconto);
	//	System.out.println(calcularDesconto.apply(p));

		UnaryOperator<Double> impostoMunicipal = valor -> {
			if (valor >= 2500) {
				valor += valor * 8.5 / 100;
				return valor;
			} else
				return 0.0;
		};
	//	System.out.println(impostoMunicipal.apply(3235.0));
		
		UnaryOperator<Double> frete = valor -> {
			if (valor >= 3000) {
				return valor += 100;
			} else return valor += 50;
		};
	//	System.out.println(frete.apply(3235.0));
		
		Function<Double, String> arredondar = valor -> String.format("%.2f", valor);
	//	System.out.println(arredondar.apply(3235.0));
		
		UnaryOperator<String> formatar = valor -> "R$"+valor;
	//	System.out.println(formatar.apply("3235,00"));
		
		String resultadoFinal = calcularDesconto
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		
		System.out.println(resultadoFinal);
	}
}
