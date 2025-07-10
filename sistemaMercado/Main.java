package sistemaMercado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Produtos produto = new Produtos();
		HorarioDaCompra horario = new HorarioDaCompra(15, 30, 30);
		Scanner sc = new Scanner(System.in);

		System.out.println("Olá, digite o preço do produto: ");
		produto.preco = sc.nextDouble();

		System.out.println("Olá, digite o dia da semana: ");
		sc.nextLine();
		String diaTeste = sc.nextLine();
		
		System.out.println("Agora a hora: ");
		horario.hora = sc.nextDouble();
		
		
		if (diaTeste.equalsIgnoreCase("domingo") || diaTeste.equalsIgnoreCase("sabado")
				|| diaTeste.equalsIgnoreCase("sábado") || horario.hora >= 20) {
			double precoComDesconto = produto.preco * 0.90;
			System.out.println("Desconto de 10% " + precoComDesconto);
		} else {
			System.out.println("Sem desconto. " + produto.preco);
		}

	}
}
