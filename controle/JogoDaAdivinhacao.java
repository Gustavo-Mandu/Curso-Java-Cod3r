package controle;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class JogoDaAdivinhacao {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 100); 
		
		// System.out.println("(Teste) O número é: " + numeroAleatorio);
		
		System.out.println("Advinhe o número de 0 a 100!");
		int tentativa;
		for (tentativa = 9; tentativa >= 0; tentativa--) {
			System.out.print("Digite um número: ");
			double numeroDigitado = sc.nextInt();
			System.out.println();
			if (numeroDigitado == numeroAleatorio) {
				System.out.println("Parabéns, você acertou o número!");
				break;
			} else
			if (numeroDigitado > numeroAleatorio) {
				System.out.println("Seu número é maior que o escondido!");
			} else {
				System.out.println("Seu número é menor que o escondido!");
			}
			System.out.println("Tentativas restantes: " + (tentativa));
		}
		sc.close();
		if (tentativa == -1) tentativa = 0;
		switch (tentativa) {
		case 0: 
			System.out.println("Fim de jogo! Acabaram as tentativas");
			System.out.println("O número era: " + numeroAleatorio);
			break;
		default:
			System.out.print("Fim de jogo!");
			break;
		}
		
	
	}
}
