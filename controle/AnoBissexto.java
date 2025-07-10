package controle;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o ano vigente: ");
		int anoAtual = sc.nextInt();
		
		if (anoAtual % 4 == 0 && (anoAtual % 100 != 0 || anoAtual % 400 == 0)) {
			System.out.println(anoAtual + " é um ano bissexto!");
		} else {
			System.out.println(anoAtual + " não é um ano bissexto!");
		}
		
		sc.close();
	}
}
