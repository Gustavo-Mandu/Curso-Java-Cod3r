package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas notas você quer informar? ");
		int quantidadedNotasInformadas = sc.nextInt();
		double[] notas = new double[quantidadedNotasInformadas];

		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a %d° nota: ", i + 1);
			notas[i] = sc.nextDouble();
		}
		
		System.out.println(Arrays.toString(notas));

		double soma = 0;
		for (double nota : notas) {
			soma += nota;
		}
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + soma / notas.length);
		
		sc.close();
	}
}
