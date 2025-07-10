package controle;

import java.util.Scanner;

public class DesafioWhile {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// calcular a media das notas de uma turma
		

		double total = 0;
		int contador = 0;
		double continuarLoop = 0;

		while (continuarLoop != -1) {
			System.out.print("Digite uma nota entre 0 e 10 (-1 para sair do programa): ");
			continuarLoop = sc.nextDouble();

			if (continuarLoop >= 0 && continuarLoop <= 10) {
				total += continuarLoop;
				contador++;
			} else if (continuarLoop != -1) {
				System.out.println("\nDigite uma nota valida!\n");
			} else {
				System.out.println("\nAté a próxima!");
			}
		}

		sc.close();
		System.out.println("\nNotas somadas: " + total);
		System.out.println("Média das notas: " + (total / contador));
	}
}
