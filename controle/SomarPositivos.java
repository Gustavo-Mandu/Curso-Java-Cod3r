package controle;

import java.util.Scanner;

public class SomarPositivos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double soma = 0;
		double numeroAuxiliar = 0;
		System.out.println("Número negativo encerra a aplicação.");
		do {
			System.out.print("Insira um número: ");
			numeroAuxiliar = sc.nextDouble();
			if (numeroAuxiliar < 0) {
				continue;
			}
			soma += numeroAuxiliar;
			System.out.println("Soma atual: " + soma);

		} while (numeroAuxiliar >= 0);

		System.out.println("Encerrado.");
	}
}
