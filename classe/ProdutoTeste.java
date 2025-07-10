package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 2500);
		var p2 = new Produto("batata", 2500); // var p2 == Produto p2
		
	
		System.out.println(p1.nome + ": " + p1.precoComDesconto(0));
		
		Produto.desconto = 0.50;
		System.out.println(p2.nome + ": " + p2.precoComDesconto(0));
	
		double mediaCarrinho = (p1.precoComDesconto(0) + p2.precoComDesconto(0)) / 2;
		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
	}

}
