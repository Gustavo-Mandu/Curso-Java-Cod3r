package classe;

public class Produto {

	// Um desconto, quando aplicado, deve ser aplicado
	// para todos os produtos, sem excessão.
	// Por padrão, o desconto é de 25%, entretanto
	// Esse valor pode mudar em situações especiais.
	
	// TODO substituir o desconto, tornando-o estático e
	// e ajustar o código para refletir essa alteração.
	
	String nome;
	double preco;
	static double desconto = 0.25;

	Produto() {
	}
	
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}

	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - (desconto + descontoDoGerente));
	}
}
