package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos alunos têm na turma? ");
		int qntAlunos = sc.nextInt();

		System.out.println("Quantas notas cada aluno têm? ");
		int qntNotas = sc.nextInt();

		int notasAlunos[][] = new int[qntAlunos][qntNotas];

		double total = 0;
		for (int i = 0; i < notasAlunos.length; i++) {
			for (int j = 0; j < notasAlunos[0].length; j++) {
				System.out.printf("Digite a %d° nota do %d° aluno : ", j + 1, i + 1);
				notasAlunos[i][j] += sc.nextInt();
				total += notasAlunos[i][j];
			}
		}
		System.out.println();

		for (int[] notas : notasAlunos) {
			System.out.println(Arrays.toString(notas));
		}

		double media = total / (qntAlunos * qntNotas);
		System.out.println("Média da turma: " + media);

		sc.close();
	}
}