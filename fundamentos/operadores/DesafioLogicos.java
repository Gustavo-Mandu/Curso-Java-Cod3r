package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogicos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)

		// Se apenas um trabalho der certo, vou comprar uma
		// televisão de 32 polegadas

		// Se os dois trabalhos derem certo, vou comprar uma
		// televisão de 50 polegadas

		// Em qualquer um dos casos em que eu comprar uma
		// televisão, a família tomara sorvete

		// Se os dois trabalhos derem errado então a família
		// não tomará sorvete e nem comprará TV.

		boolean trabalho1 = false;
		boolean trabalho2 = false;

		System.out.println("O primeiro trabalho deu certo? sim (1) ou não (2)");
		int resultado = sc.nextInt();
		if (resultado == 1)
			trabalho1 = true;
		else
			trabalho1 = false;

		System.out.println("O segundo trabalho deu certo? sim (1) ou não (2)");
		resultado = sc.nextInt();
		if (resultado == 1)
			trabalho2 = true;
		else
			trabalho2 = false;

		sc.close();
		
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTvNenhuma = !trabalho1 && !trabalho2;

		if (trabalho1 ^ trabalho2) {
			System.out.println("TV de 32\", vamos tomar sorvete\n");
			System.out.println("comprouTv32\"? " + comprouTv32);
			System.out.println("comprouTv50\"? " + comprouTv50);
			System.out.println("comprouTvNenhuma? " + comprouTvNenhuma);
		} else if (trabalho1 && trabalho2) {
			System.out.println("TV de 50\", vamos tomar sorvete!\n");
			System.out.println("comprouTv32\"? " + comprouTv32);
			System.out.println("comprouTv50\"? " + comprouTv50);
			System.out.println("comprouTvNenhuma? " + comprouTvNenhuma);
		} else {
			System.out.println("Deu ruim! Sem TV e sem sorvete\n");
			System.out.println("comprouTv32\"? " + comprouTv32);
			System.out.println("comprouTv50\"? " + comprouTv50);
			System.out.println("comprouTvNenhuma? " + comprouTvNenhuma);
		}
		boolean maisSaudavel = comprouTv32 ^ comprouTv50;
		
		System.out.println(maisSaudavel);

		System.out.println(
				"Tomou sorvete? " + ((maisSaudavel) ? "Sim" : "Não") + 
				"\nFicou mais saudável? " + ((maisSaudavel) ? "Não ficou" : "Ficou"));

	}
}